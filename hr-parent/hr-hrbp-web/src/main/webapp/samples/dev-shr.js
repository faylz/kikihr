 var nodeIdCounter = -1; // use a sequence to guarantee key uniqueness as we add/remove/modify nodes

  function init() {
    if (window.goSamples) goSamples();  // init for these samples -- you don't need to call this
    var $ = go.GraphObject.make;  // for conciseness in defining templates

    myDiagram =
      $(go.Diagram, "myDiagramDiv", // must be the ID or reference to div
        {
          initialContentAlignment: go.Spot.Center,
          maxSelectionCount: 1, // users can select only one part at a time
          validCycle: go.Diagram.CycleDestinationTree, // make sure users can only create trees
          layout:
            $(go.TreeLayout,
              {
                treeStyle: go.TreeLayout.StyleLayered,
                arrangement: go.TreeLayout.ArrangementVertical,//ArrangementVertical,ArrangementHorizontal,TreeLayout.ArrangementFixedRoots.
                // properties for most of the tree:
                angle: 90,	//树的旋转角度
                layerSpacing: 20,	//节点的间距
				setsPortSpot:true,
				setsChildPortSpot:true,
				
                // properties for the "last parents":
                //alternateAngle: 90,
                //alternateLayerSpacing: 35,
                //alternateAlignment: go.TreeLayout.AlignmentBusBranching,
                //alternateNodeSpacing: 20
              }),
          "undoManager.isEnabled": true // enable undo & redo
        });
	function managerNameStyle(){
	  return { font: " Italic small-caps bold 12px Georgia, Serif",stroke: "black",textAlign:"left" };	
	}
	
	function positionStyle() {
      return { font: "bold 12px 微软雅黑", stroke: "black",textAlign:"left" };
    }
	
	function childNodesCountLableStyle(){
		 return { font: "bold 12px 微软雅黑", stroke: "red",textAlign:"left" };
	}
	function childNodesCountTextStyle(){
		 return { font: "bold 12px 微软雅黑", stroke: "blue",textAlign:"left" };
	}
  	function findHeadShot(key) {
     /* if (key < 0 || key > 16) return "images/HSnopic.png"; 
      return "images/HS" + key + ".png"*/
	  return "images/HSnopic.png"; 
    }
    myDiagram.nodeTemplate  =
	   $(go.Node, "Auto",{
		   
			},
		   $(go.Shape, "RoundedRectangle",
			  {
				name: "SHAPE", fill: "#B0C4DE", stroke: null,
				// set the port properties:
				portId: "", fromLinkable: false, toLinkable: false, cursor: "pointer"
			  }
			),
			$(go.Panel, "Position",
				{minSize: new go.Size(95, 200)
				
				 },
				$(go.Panel, "Position",
					{ margin: new go.Margin(0, 0, 0, 0),
					  width:90,
					  height:120,
					  background: "#FFE4B5"
					},
				
					$(go.Picture,
						{
						  name: 'Picture',
						  desiredSize: new go.Size(65, 75),
						  margin: new go.Margin(5, 5, 5, 5),
						}
						,new go.Binding("source", "key", findHeadShot)
						)
				), 
				$(go.Panel,
					{ height: 10 ,
					  position: new go.Point(90, 15)
					},  // always this height, even if the TreeExpanderButton is not visible
					$("TreeExpanderButton")),
			  
				// define the panel where the text will appear
		       
				$(go.TextBlock, managerNameStyle(),  // the name
				  {		
					isMultiline: false,
					minSize: new go.Size(90, 16),
					maxSize: new go.Size(90,40),
					alignment: go.Spot.Left,
					position: new go.Point(0, 90),
					margin: new go.Margin(0, 0, 0, 2)
				  },
				  new go.Binding("text", "name").makeTwoWay()),  // end Table Panel
				 
				$(go.Shape, "LineH",
				  {
					name: "SHAPE",  // named so that the above properties can refer to this GraphObject
					width: 100, height: 1,
					stroke: "gray",
					fill: null,
					strokeWidth: 1,
					cursor: "pointer",
					position: new go.Point(0, 125)
				  }),
				  
				  $(go.TextBlock, positionStyle(),  // the name
				  {		
					isMultiline: false,
					minSize: new go.Size(100, 16),
					maxSize: new go.Size(100,40),
					isUnderline:true,
					alignment: go.Spot.Left,
					position: new go.Point(0, 130),
					margin: new go.Margin(0, 0, 0, 2)
				  },
				  new go.Binding("text", "position").makeTwoWay()),  // end Table Panel
				  
				  $(go.Shape, "LineH",
				  {
					name: "SHAPE",  // named so that the above properties can refer to this GraphObject
					width: 100, height: 1,
					stroke: "gray",
					fill: null,
					strokeWidth: 1,
					cursor: "pointer",
					position: new go.Point(0, 170)
				  }),
				  
				   $(go.TextBlock, childNodesCountLableStyle(),  // the name
				  {		
					text:"下级人员",
					width:50,
					alignment: go.Spot.Left,
					position: new go.Point(0, 180),
					margin: new go.Margin(0, 0, 0, 2)
				  }),
				  $(go.TextBlock, childNodesCountTextStyle(),  // the name
				  {		
					text:"2",
					alignment: go.Spot.Left,
					position: new go.Point(78, 180),
					margin: new go.Margin(0, 0, 0, 2)
				  })
			) // end Vertical Panel
		
		);//end node
			
	
    // define the Link template
    myDiagram.linkTemplate =
      $(go.Link, go.Link.Bezier,
        { 
		  relinkableFrom: false, 
		  relinkableTo: false,
		  curviness:1,
		  smoothness:10,
		  adjusting:"Scale"//0-1,
		  //fromEndSegmentLength:0
		  //geometry:'M200,300 Q400,50 600,300 T1000,300'
		  },
        $(go.Shape, { strokeWidth: 1, stroke: "#000" }));  // the link shape

    // read in the JSON-format data from the "mySavedModel" element
    load();
	myDiagram.findTreeRoots().each(function(n) { n.collapseTree(2); });
	myDiagram.nodes.each(function(n) { n.collapseTree(2); })
    // support editing the properties of the selected person in HTML
    if (window.Inspector) myInspector = new Inspector('myInspector', myDiagram,
      {
        properties: {
          'key': { readOnly: true },
          'comments': {}
        }
      });
  }

  // Show the diagram's model in JSON format
  function save() {
    document.getElementById("mySavedModel").value = myDiagram.model.toJson();
    myDiagram.isModified = false;
  }
  function load() {
    myDiagram.model = go.Model.fromJson(document.getElementById("mySavedModel").value);
  }