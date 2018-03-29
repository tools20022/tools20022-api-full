/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.colr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CollateralManagementLatestVersion;
import com.tools20022.repository.choice.ExpectedCollateral2Choice;
import com.tools20022.repository.choice.MarginRequirement1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CollateralManagementISOLatestversion;
import com.tools20022.repository.msgset.CollateralManagementMaintenance20162017;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MarginCallRequest message is sent by the collateral taker or its
 * collateral manager to the collateral giver or its collateral manager<br>
 * This message is used to request new collateral at the initiation of an
 * exposure or request additional collateral for an existing exposure. It can
 * also be used to recall collateral upon the collateral giver or its collateral
 * manager's request.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * When sent by the collateral taker the MarginCallRequest message is used to:<br>
 * - request new collateral at the initiation of an exposure<br>
 * - request additional collateral<br>
 * When sent by the collateral giver the MarginCallRequest message is used to:<br>
 * - request the return of collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmTransactionIdentification
 * MarginCallRequestV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmObligation
 * MarginCallRequestV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmAgreement
 * MarginCallRequestV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginCallResult
 * MarginCallRequestV04.mmMarginCallResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginDetailsDueToA
 * MarginCallRequestV04.mmMarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginDetailsDueToB
 * MarginCallRequestV04.mmMarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmRequirementDetailsDueToA
 * MarginCallRequestV04.mmRequirementDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmRequirementDetailsDueToB
 * MarginCallRequestV04.mmRequirementDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmExpectedCollateralDueToA
 * MarginCallRequestV04.mmExpectedCollateralDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmExpectedCollateralDueToB
 * MarginCallRequestV04.mmExpectedCollateralDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginCallDetails
 * MarginCallRequestV04.mmMarginCallDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmSupplementaryData
 * MarginCallRequestV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementISOLatestversion
 * CollateralManagementISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementMaintenance20162017
 * CollateralManagementMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MrgnCallReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
 * CollateralManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.003.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCallRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MarginCallRequest message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager\r\nThis message is used to request new collateral at the initiation of an exposure or request additional collateral for an existing exposure. It can also be used to recall collateral upon the collateral giver or its collateral manager's request.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral taker the MarginCallRequest message is used to:\r\n- request new collateral at the initiation of an exposure\r\n- request additional collateral\r\nWhen sent by the collateral giver the MarginCallRequest message is used to:\r\n- request the return of collateral."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03
 * MarginCallRequestV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginCallRequestV04", propOrder = {"transactionIdentification", "obligation", "agreement", "marginCallResult", "marginDetailsDueToA", "marginDetailsDueToB", "requirementDetailsDueToA", "requirementDetailsDueToB",
		"expectedCollateralDueToA", "expectedCollateralDueToB", "marginCallDetails", "supplementaryData"})
public class MarginCallRequestV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected Max35Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as know by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmTransactionIdentification
	 * MarginCallRequestV03.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, Max35Text> mmTransactionIdentification = new MMMessageBuildingBlock<MarginCallRequestV04, Max35Text>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			previousVersion_lazy = () -> MarginCallRequestV03.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MarginCallRequestV04 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "Oblgtn", required = true)
	protected Obligation4 obligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Obligation4
	 * Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oblgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmObligation
	 * MarginCallRequestV03.mmObligation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, Obligation4> mmObligation = new MMMessageBuildingBlock<MarginCallRequestV04, Obligation4>() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			previousVersion_lazy = () -> MarginCallRequestV03.mmObligation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation4.mmObject();
		}

		@Override
		public Obligation4 getValue(MarginCallRequestV04 obj) {
			return obj.getObligation();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, Obligation4 value) {
			obj.setObligation(value);
		}
	};
	@XmlElement(name = "Agrmt")
	protected Agreement4 agreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Agreement4
	 * Agreement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement details for the over the counter market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmAgreement
	 * MarginCallRequestV03.mmAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, Optional<Agreement4>> mmAgreement = new MMMessageBuildingBlock<MarginCallRequestV04, Optional<Agreement4>>() {
		{
			xmlTag = "Agrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			previousVersion_lazy = () -> MarginCallRequestV03.mmAgreement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Agreement4.mmObject();
		}

		@Override
		public Optional<Agreement4> getValue(MarginCallRequestV04 obj) {
			return obj.getAgreement();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, Optional<Agreement4> value) {
			obj.setAgreement(value.orElse(null));
		}
	};
	@XmlElement(name = "MrgnCallRslt", required = true)
	protected MarginCallResult3 marginCallResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarginCallResult3
	 * MarginCallResult3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Summation of the call amounts per margin type. It is provided for the purposes of carrying forward for future messages that are used to compare the margin call results to determine whether a call is agreed or full/partially disputed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmMarginCallResult
	 * MarginCallRequestV03.mmMarginCallResult}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, MarginCallResult3> mmMarginCallResult = new MMMessageBuildingBlock<MarginCallRequestV04, MarginCallResult3>() {
		{
			xmlTag = "MrgnCallRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResult";
			definition = "Summation of the call amounts per margin type. It is provided for the purposes of carrying forward for future messages that are used to compare the margin call results to determine whether a call is agreed or full/partially disputed.";
			previousVersion_lazy = () -> MarginCallRequestV03.mmMarginCallResult;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MarginCallResult3.mmObject();
		}

		@Override
		public MarginCallResult3 getValue(MarginCallRequestV04 obj) {
			return obj.getMarginCallResult();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, MarginCallResult3 value) {
			obj.setMarginCallResult(value);
		}
	};
	@XmlElement(name = "MrgnDtlsDueToA")
	protected MarginCall1 marginDetailsDueToA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MarginCall1
	 * MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnDtlsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginDetailsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin calculation that would be due to party A."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmMarginDetailsDueToA
	 * MarginCallRequestV03.mmMarginDetailsDueToA}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, Optional<MarginCall1>> mmMarginDetailsDueToA = new MMMessageBuildingBlock<MarginCallRequestV04, Optional<MarginCall1>>() {
		{
			xmlTag = "MrgnDtlsDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToA";
			definition = "Provides details about the margin calculation that would be due to party A.";
			previousVersion_lazy = () -> MarginCallRequestV03.mmMarginDetailsDueToA;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCall1.mmObject();
		}

		@Override
		public Optional<MarginCall1> getValue(MarginCallRequestV04 obj) {
			return obj.getMarginDetailsDueToA();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, Optional<MarginCall1> value) {
			obj.setMarginDetailsDueToA(value.orElse(null));
		}
	};
	@XmlElement(name = "MrgnDtlsDueToB")
	protected MarginCall1 marginDetailsDueToB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MarginCall1
	 * MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnDtlsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginDetailsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin calculation that would be due to party B."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmMarginDetailsDueToB
	 * MarginCallRequestV03.mmMarginDetailsDueToB}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, Optional<MarginCall1>> mmMarginDetailsDueToB = new MMMessageBuildingBlock<MarginCallRequestV04, Optional<MarginCall1>>() {
		{
			xmlTag = "MrgnDtlsDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToB";
			definition = "Provides details about the margin calculation that would be due to party B.";
			previousVersion_lazy = () -> MarginCallRequestV03.mmMarginDetailsDueToB;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCall1.mmObject();
		}

		@Override
		public Optional<MarginCall1> getValue(MarginCallRequestV04 obj) {
			return obj.getMarginDetailsDueToB();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, Optional<MarginCall1> value) {
			obj.setMarginDetailsDueToB(value.orElse(null));
		}
	};
	@XmlElement(name = "RqrmntDtlsDueToA")
	protected MarginRequirement1Choice requirementDetailsDueToA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice
	 * MarginRequirement1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqrmntDtlsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequirementDetailsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of expected margin that will be either delivered to party A by party B or recalled to party A from party B."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmRequirementDetailsDueToA
	 * MarginCallRequestV03.mmRequirementDetailsDueToA}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, Optional<MarginRequirement1Choice>> mmRequirementDetailsDueToA = new MMMessageBuildingBlock<MarginCallRequestV04, Optional<MarginRequirement1Choice>>() {
		{
			xmlTag = "RqrmntDtlsDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequirementDetailsDueToA";
			definition = "Amount of expected margin that will be either delivered to party A by party B or recalled to party A from party B.";
			previousVersion_lazy = () -> MarginCallRequestV03.mmRequirementDetailsDueToA;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginRequirement1Choice.mmObject();
		}

		@Override
		public Optional<MarginRequirement1Choice> getValue(MarginCallRequestV04 obj) {
			return obj.getRequirementDetailsDueToA();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, Optional<MarginRequirement1Choice> value) {
			obj.setRequirementDetailsDueToA(value.orElse(null));
		}
	};
	@XmlElement(name = "RqrmntDtlsDueToB")
	protected MarginRequirement1Choice requirementDetailsDueToB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MarginRequirement1Choice
	 * MarginRequirement1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqrmntDtlsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequirementDetailsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of expected margin that will be either delivered to party B by party A or recalled to party B from party A."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmRequirementDetailsDueToB
	 * MarginCallRequestV03.mmRequirementDetailsDueToB}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, Optional<MarginRequirement1Choice>> mmRequirementDetailsDueToB = new MMMessageBuildingBlock<MarginCallRequestV04, Optional<MarginRequirement1Choice>>() {
		{
			xmlTag = "RqrmntDtlsDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequirementDetailsDueToB";
			definition = "Amount of expected margin that will be either delivered to party B by party A or recalled to party B from party A.";
			previousVersion_lazy = () -> MarginCallRequestV03.mmRequirementDetailsDueToB;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginRequirement1Choice.mmObject();
		}

		@Override
		public Optional<MarginRequirement1Choice> getValue(MarginCallRequestV04 obj) {
			return obj.getRequirementDetailsDueToB();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, Optional<MarginRequirement1Choice> value) {
			obj.setRequirementDetailsDueToB(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdCollDueToA")
	protected ExpectedCollateral2Choice expectedCollateralDueToA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
	 * ExpectedCollateral2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdCollDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCollateralDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the type of collateral that will be either delivered to party A by party B or recalled to party A from party B."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmExpectedCollateralDueToA
	 * MarginCallRequestV03.mmExpectedCollateralDueToA}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, Optional<ExpectedCollateral2Choice>> mmExpectedCollateralDueToA = new MMMessageBuildingBlock<MarginCallRequestV04, Optional<ExpectedCollateral2Choice>>() {
		{
			xmlTag = "XpctdCollDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCollateralDueToA";
			definition = "Provides details about the type of collateral that will be either delivered to party A by party B or recalled to party A from party B.";
			previousVersion_lazy = () -> MarginCallRequestV03.mmExpectedCollateralDueToA;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExpectedCollateral2Choice.mmObject();
		}

		@Override
		public Optional<ExpectedCollateral2Choice> getValue(MarginCallRequestV04 obj) {
			return obj.getExpectedCollateralDueToA();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, Optional<ExpectedCollateral2Choice> value) {
			obj.setExpectedCollateralDueToA(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdCollDueToB")
	protected ExpectedCollateral2Choice expectedCollateralDueToB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral2Choice
	 * ExpectedCollateral2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdCollDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCollateralDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the type of collateral that will be either delivered to party B by party A or recalled to party B from party A."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmExpectedCollateralDueToB
	 * MarginCallRequestV03.mmExpectedCollateralDueToB}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, Optional<ExpectedCollateral2Choice>> mmExpectedCollateralDueToB = new MMMessageBuildingBlock<MarginCallRequestV04, Optional<ExpectedCollateral2Choice>>() {
		{
			xmlTag = "XpctdCollDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCollateralDueToB";
			definition = "Provides details about the type of collateral that will be either delivered to party B by party A or recalled to party B from party A.";
			previousVersion_lazy = () -> MarginCallRequestV03.mmExpectedCollateralDueToB;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExpectedCollateral2Choice.mmObject();
		}

		@Override
		public Optional<ExpectedCollateral2Choice> getValue(MarginCallRequestV04 obj) {
			return obj.getExpectedCollateralDueToB();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, Optional<ExpectedCollateral2Choice> value) {
			obj.setExpectedCollateralDueToB(value.orElse(null));
		}
	};
	@XmlElement(name = "MrgnCallDtls")
	protected List<MarginCall2> marginCallDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MarginCall2
	 * MarginCall2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows the reporting of the margin requirements for multiple accounts and report a single margin call amount made up of the aggregate of all the individual requirement amounts."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, List<MarginCall2>> mmMarginCallDetails = new MMMessageBuildingBlock<MarginCallRequestV04, List<MarginCall2>>() {
		{
			xmlTag = "MrgnCallDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallDetails";
			definition = "Allows the reporting of the margin requirements for multiple accounts and report a single margin call amount made up of the aggregate of all the individual requirement amounts.";
			minOccurs = 0;
			complexType_lazy = () -> MarginCall2.mmObject();
		}

		@Override
		public List<MarginCall2> getValue(MarginCallRequestV04 obj) {
			return obj.getMarginCallDetails();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, List<MarginCall2> value) {
			obj.setMarginCallDetails(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmSupplementaryData
	 * MarginCallRequestV03.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MarginCallRequestV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			previousVersion_lazy = () -> MarginCallRequestV03.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MarginCallRequestV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MarginCallRequestV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCallRequestV04";
				definition = "Scope\r\nThe MarginCallRequest message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager\r\nThis message is used to request new collateral at the initiation of an exposure or request additional collateral for an existing exposure. It can also be used to recall collateral upon the collateral giver or its collateral manager's request.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral taker the MarginCallRequest message is used to:\r\n- request new collateral at the initiation of an exposure\r\n- request additional collateral\r\nWhen sent by the collateral giver the MarginCallRequest message is used to:\r\n- request the return of collateral.";
				previousVersion_lazy = () -> MarginCallRequestV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(CollateralManagementISOLatestversion.mmObject(), CollateralManagementMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "MrgnCallReq";
				businessArea_lazy = () -> CollateralManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.MarginCallRequestV04.mmTransactionIdentification, com.tools20022.repository.area.colr.MarginCallRequestV04.mmObligation,
						com.tools20022.repository.area.colr.MarginCallRequestV04.mmAgreement, com.tools20022.repository.area.colr.MarginCallRequestV04.mmMarginCallResult,
						com.tools20022.repository.area.colr.MarginCallRequestV04.mmMarginDetailsDueToA, com.tools20022.repository.area.colr.MarginCallRequestV04.mmMarginDetailsDueToB,
						com.tools20022.repository.area.colr.MarginCallRequestV04.mmRequirementDetailsDueToA, com.tools20022.repository.area.colr.MarginCallRequestV04.mmRequirementDetailsDueToB,
						com.tools20022.repository.area.colr.MarginCallRequestV04.mmExpectedCollateralDueToA, com.tools20022.repository.area.colr.MarginCallRequestV04.mmExpectedCollateralDueToB,
						com.tools20022.repository.area.colr.MarginCallRequestV04.mmMarginCallDetails, com.tools20022.repository.area.colr.MarginCallRequestV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "003";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarginCallRequestV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public MarginCallRequestV04 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Obligation4 getObligation() {
		return obligation;
	}

	public MarginCallRequestV04 setObligation(Obligation4 obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public Optional<Agreement4> getAgreement() {
		return agreement == null ? Optional.empty() : Optional.of(agreement);
	}

	public MarginCallRequestV04 setAgreement(Agreement4 agreement) {
		this.agreement = agreement;
		return this;
	}

	public MarginCallResult3 getMarginCallResult() {
		return marginCallResult;
	}

	public MarginCallRequestV04 setMarginCallResult(MarginCallResult3 marginCallResult) {
		this.marginCallResult = Objects.requireNonNull(marginCallResult);
		return this;
	}

	public Optional<MarginCall1> getMarginDetailsDueToA() {
		return marginDetailsDueToA == null ? Optional.empty() : Optional.of(marginDetailsDueToA);
	}

	public MarginCallRequestV04 setMarginDetailsDueToA(MarginCall1 marginDetailsDueToA) {
		this.marginDetailsDueToA = marginDetailsDueToA;
		return this;
	}

	public Optional<MarginCall1> getMarginDetailsDueToB() {
		return marginDetailsDueToB == null ? Optional.empty() : Optional.of(marginDetailsDueToB);
	}

	public MarginCallRequestV04 setMarginDetailsDueToB(MarginCall1 marginDetailsDueToB) {
		this.marginDetailsDueToB = marginDetailsDueToB;
		return this;
	}

	public Optional<MarginRequirement1Choice> getRequirementDetailsDueToA() {
		return requirementDetailsDueToA == null ? Optional.empty() : Optional.of(requirementDetailsDueToA);
	}

	public MarginCallRequestV04 setRequirementDetailsDueToA(MarginRequirement1Choice requirementDetailsDueToA) {
		this.requirementDetailsDueToA = requirementDetailsDueToA;
		return this;
	}

	public Optional<MarginRequirement1Choice> getRequirementDetailsDueToB() {
		return requirementDetailsDueToB == null ? Optional.empty() : Optional.of(requirementDetailsDueToB);
	}

	public MarginCallRequestV04 setRequirementDetailsDueToB(MarginRequirement1Choice requirementDetailsDueToB) {
		this.requirementDetailsDueToB = requirementDetailsDueToB;
		return this;
	}

	public Optional<ExpectedCollateral2Choice> getExpectedCollateralDueToA() {
		return expectedCollateralDueToA == null ? Optional.empty() : Optional.of(expectedCollateralDueToA);
	}

	public MarginCallRequestV04 setExpectedCollateralDueToA(ExpectedCollateral2Choice expectedCollateralDueToA) {
		this.expectedCollateralDueToA = expectedCollateralDueToA;
		return this;
	}

	public Optional<ExpectedCollateral2Choice> getExpectedCollateralDueToB() {
		return expectedCollateralDueToB == null ? Optional.empty() : Optional.of(expectedCollateralDueToB);
	}

	public MarginCallRequestV04 setExpectedCollateralDueToB(ExpectedCollateral2Choice expectedCollateralDueToB) {
		this.expectedCollateralDueToB = expectedCollateralDueToB;
		return this;
	}

	public List<MarginCall2> getMarginCallDetails() {
		return marginCallDetails == null ? marginCallDetails = new ArrayList<>() : marginCallDetails;
	}

	public MarginCallRequestV04 setMarginCallDetails(List<MarginCall2> marginCallDetails) {
		this.marginCallDetails = Objects.requireNonNull(marginCallDetails);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MarginCallRequestV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.003.001.04")
	static public class Document {
		@XmlElement(name = "MrgnCallReq", required = true)
		public MarginCallRequestV04 messageBody;
	}
}