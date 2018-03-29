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
import com.tools20022.repository.area.CollateralManagementPreviousVersion;
import com.tools20022.repository.choice.ExpectedCollateral1Choice;
import com.tools20022.repository.choice.MarginRequirement1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CollateralManagementISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
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
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmTransactionIdentification
 * MarginCallRequestV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmObligation
 * MarginCallRequestV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmAgreement
 * MarginCallRequestV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmMarginDetailsDueToA
 * MarginCallRequestV03.mmMarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmMarginDetailsDueToB
 * MarginCallRequestV03.mmMarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmRequirementDetailsDueToA
 * MarginCallRequestV03.mmRequirementDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmRequirementDetailsDueToB
 * MarginCallRequestV03.mmRequirementDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmMarginCallResult
 * MarginCallRequestV03.mmMarginCallResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmExpectedCollateralDueToB
 * MarginCallRequestV03.mmExpectedCollateralDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmExpectedCollateralDueToA
 * MarginCallRequestV03.mmExpectedCollateralDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmSupplementaryData
 * MarginCallRequestV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementISOPreviousversion
 * CollateralManagementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MrgnCallReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementPreviousVersion
 * CollateralManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.003.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCallRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MarginCallRequest message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager\r\nThis message is used to request new collateral at the initiation of an exposure or request additional collateral for an existing exposure. It can also be used to recall collateral upon the collateral giver or its collateral manager's request.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral taker the MarginCallRequest message is used to:\r\n- request new collateral at the initiation of an exposure\r\n- request additional collateral\r\nWhen sent by the collateral giver the MarginCallRequest message is used to:\r\n- request the return of collateral."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04
 * MarginCallRequestV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginCallRequestV03", propOrder = {"transactionIdentification", "obligation", "agreement", "marginDetailsDueToA", "marginDetailsDueToB", "requirementDetailsDueToA", "requirementDetailsDueToB", "marginCallResult",
		"expectedCollateralDueToB", "expectedCollateralDueToA", "supplementaryData"})
public class MarginCallRequestV03 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmTransactionIdentification
	 * MarginCallRequestV04.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV03, Max35Text> mmTransactionIdentification = new MMMessageBuildingBlock<MarginCallRequestV03, Max35Text>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MarginCallRequestV03 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(MarginCallRequestV03 obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "Oblgtn", required = true)
	protected Obligation3 obligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Obligation3
	 * Obligation3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmObligation
	 * MarginCallRequestV04.mmObligation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV03, Obligation3> mmObligation = new MMMessageBuildingBlock<MarginCallRequestV03, Obligation3>() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmObligation);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation3.mmObject();
		}

		@Override
		public Obligation3 getValue(MarginCallRequestV03 obj) {
			return obj.getObligation();
		}

		@Override
		public void setValue(MarginCallRequestV03 obj, Obligation3 value) {
			obj.setObligation(value);
		}
	};
	@XmlElement(name = "Agrmt")
	protected Agreement2 agreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Agreement2
	 * Agreement2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmAgreement
	 * MarginCallRequestV04.mmAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV03, Optional<Agreement2>> mmAgreement = new MMMessageBuildingBlock<MarginCallRequestV03, Optional<Agreement2>>() {
		{
			xmlTag = "Agrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmAgreement);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Agreement2.mmObject();
		}

		@Override
		public Optional<Agreement2> getValue(MarginCallRequestV03 obj) {
			return obj.getAgreement();
		}

		@Override
		public void setValue(MarginCallRequestV03 obj, Optional<Agreement2> value) {
			obj.setAgreement(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginDetailsDueToA
	 * MarginCallRequestV04.mmMarginDetailsDueToA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV03, Optional<MarginCall1>> mmMarginDetailsDueToA = new MMMessageBuildingBlock<MarginCallRequestV03, Optional<MarginCall1>>() {
		{
			xmlTag = "MrgnDtlsDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToA";
			definition = "Provides details about the margin calculation that would be due to party A.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmMarginDetailsDueToA);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCall1.mmObject();
		}

		@Override
		public Optional<MarginCall1> getValue(MarginCallRequestV03 obj) {
			return obj.getMarginDetailsDueToA();
		}

		@Override
		public void setValue(MarginCallRequestV03 obj, Optional<MarginCall1> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginDetailsDueToB
	 * MarginCallRequestV04.mmMarginDetailsDueToB}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV03, Optional<MarginCall1>> mmMarginDetailsDueToB = new MMMessageBuildingBlock<MarginCallRequestV03, Optional<MarginCall1>>() {
		{
			xmlTag = "MrgnDtlsDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToB";
			definition = "Provides details about the margin calculation that would be due to party B.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmMarginDetailsDueToB);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCall1.mmObject();
		}

		@Override
		public Optional<MarginCall1> getValue(MarginCallRequestV03 obj) {
			return obj.getMarginDetailsDueToB();
		}

		@Override
		public void setValue(MarginCallRequestV03 obj, Optional<MarginCall1> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmRequirementDetailsDueToA
	 * MarginCallRequestV04.mmRequirementDetailsDueToA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV03, Optional<MarginRequirement1Choice>> mmRequirementDetailsDueToA = new MMMessageBuildingBlock<MarginCallRequestV03, Optional<MarginRequirement1Choice>>() {
		{
			xmlTag = "RqrmntDtlsDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequirementDetailsDueToA";
			definition = "Amount of expected margin that will be either delivered to party A by party B or recalled to party A from party B.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmRequirementDetailsDueToA);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginRequirement1Choice.mmObject();
		}

		@Override
		public Optional<MarginRequirement1Choice> getValue(MarginCallRequestV03 obj) {
			return obj.getRequirementDetailsDueToA();
		}

		@Override
		public void setValue(MarginCallRequestV03 obj, Optional<MarginRequirement1Choice> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmRequirementDetailsDueToB
	 * MarginCallRequestV04.mmRequirementDetailsDueToB}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV03, Optional<MarginRequirement1Choice>> mmRequirementDetailsDueToB = new MMMessageBuildingBlock<MarginCallRequestV03, Optional<MarginRequirement1Choice>>() {
		{
			xmlTag = "RqrmntDtlsDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequirementDetailsDueToB";
			definition = "Amount of expected margin that will be either delivered to party B by party A or recalled to party B from party A.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmRequirementDetailsDueToB);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginRequirement1Choice.mmObject();
		}

		@Override
		public Optional<MarginRequirement1Choice> getValue(MarginCallRequestV03 obj) {
			return obj.getRequirementDetailsDueToB();
		}

		@Override
		public void setValue(MarginCallRequestV03 obj, Optional<MarginRequirement1Choice> value) {
			obj.setRequirementDetailsDueToB(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginCallResult
	 * MarginCallRequestV04.mmMarginCallResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV03, MarginCallResult3> mmMarginCallResult = new MMMessageBuildingBlock<MarginCallRequestV03, MarginCallResult3>() {
		{
			xmlTag = "MrgnCallRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResult";
			definition = "Summation of the call amounts per margin type. It is provided for the purposes of carrying forward for future messages that are used to compare the margin call results to determine whether a call is agreed or full/partially disputed.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmMarginCallResult);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MarginCallResult3.mmObject();
		}

		@Override
		public MarginCallResult3 getValue(MarginCallRequestV03 obj) {
			return obj.getMarginCallResult();
		}

		@Override
		public void setValue(MarginCallRequestV03 obj, MarginCallResult3 value) {
			obj.setMarginCallResult(value);
		}
	};
	@XmlElement(name = "XpctdCollDueToB")
	protected ExpectedCollateral1Choice expectedCollateralDueToB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral1Choice
	 * ExpectedCollateral1Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmExpectedCollateralDueToB
	 * MarginCallRequestV04.mmExpectedCollateralDueToB}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV03, Optional<ExpectedCollateral1Choice>> mmExpectedCollateralDueToB = new MMMessageBuildingBlock<MarginCallRequestV03, Optional<ExpectedCollateral1Choice>>() {
		{
			xmlTag = "XpctdCollDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCollateralDueToB";
			definition = "Provides details about the type of collateral that will be either delivered to party B by party A or recalled to party B from party A.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmExpectedCollateralDueToB);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExpectedCollateral1Choice.mmObject();
		}

		@Override
		public Optional<ExpectedCollateral1Choice> getValue(MarginCallRequestV03 obj) {
			return obj.getExpectedCollateralDueToB();
		}

		@Override
		public void setValue(MarginCallRequestV03 obj, Optional<ExpectedCollateral1Choice> value) {
			obj.setExpectedCollateralDueToB(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdCollDueToA")
	protected ExpectedCollateral1Choice expectedCollateralDueToA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExpectedCollateral1Choice
	 * ExpectedCollateral1Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmExpectedCollateralDueToA
	 * MarginCallRequestV04.mmExpectedCollateralDueToA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV03, Optional<ExpectedCollateral1Choice>> mmExpectedCollateralDueToA = new MMMessageBuildingBlock<MarginCallRequestV03, Optional<ExpectedCollateral1Choice>>() {
		{
			xmlTag = "XpctdCollDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCollateralDueToA";
			definition = "Provides details about the type of collateral that will be either delivered to party A by party B or recalled to party A from party B.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmExpectedCollateralDueToA);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExpectedCollateral1Choice.mmObject();
		}

		@Override
		public Optional<ExpectedCollateral1Choice> getValue(MarginCallRequestV03 obj) {
			return obj.getExpectedCollateralDueToA();
		}

		@Override
		public void setValue(MarginCallRequestV03 obj, Optional<ExpectedCollateral1Choice> value) {
			obj.setExpectedCollateralDueToA(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmSupplementaryData
	 * MarginCallRequestV04.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallRequestV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MarginCallRequestV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MarginCallRequestV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MarginCallRequestV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCallRequestV03";
				definition = "Scope\r\nThe MarginCallRequest message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager\r\nThis message is used to request new collateral at the initiation of an exposure or request additional collateral for an existing exposure. It can also be used to recall collateral upon the collateral giver or its collateral manager's request.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral taker the MarginCallRequest message is used to:\r\n- request new collateral at the initiation of an exposure\r\n- request additional collateral\r\nWhen sent by the collateral giver the MarginCallRequest message is used to:\r\n- request the return of collateral.";
				nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject(), CollateralManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "MrgnCallReq";
				businessArea_lazy = () -> CollateralManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.MarginCallRequestV03.mmTransactionIdentification, com.tools20022.repository.area.colr.MarginCallRequestV03.mmObligation,
						com.tools20022.repository.area.colr.MarginCallRequestV03.mmAgreement, com.tools20022.repository.area.colr.MarginCallRequestV03.mmMarginDetailsDueToA,
						com.tools20022.repository.area.colr.MarginCallRequestV03.mmMarginDetailsDueToB, com.tools20022.repository.area.colr.MarginCallRequestV03.mmRequirementDetailsDueToA,
						com.tools20022.repository.area.colr.MarginCallRequestV03.mmRequirementDetailsDueToB, com.tools20022.repository.area.colr.MarginCallRequestV03.mmMarginCallResult,
						com.tools20022.repository.area.colr.MarginCallRequestV03.mmExpectedCollateralDueToB, com.tools20022.repository.area.colr.MarginCallRequestV03.mmExpectedCollateralDueToA,
						com.tools20022.repository.area.colr.MarginCallRequestV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "003";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarginCallRequestV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public MarginCallRequestV03 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Obligation3 getObligation() {
		return obligation;
	}

	public MarginCallRequestV03 setObligation(Obligation3 obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public Optional<Agreement2> getAgreement() {
		return agreement == null ? Optional.empty() : Optional.of(agreement);
	}

	public MarginCallRequestV03 setAgreement(Agreement2 agreement) {
		this.agreement = agreement;
		return this;
	}

	public Optional<MarginCall1> getMarginDetailsDueToA() {
		return marginDetailsDueToA == null ? Optional.empty() : Optional.of(marginDetailsDueToA);
	}

	public MarginCallRequestV03 setMarginDetailsDueToA(MarginCall1 marginDetailsDueToA) {
		this.marginDetailsDueToA = marginDetailsDueToA;
		return this;
	}

	public Optional<MarginCall1> getMarginDetailsDueToB() {
		return marginDetailsDueToB == null ? Optional.empty() : Optional.of(marginDetailsDueToB);
	}

	public MarginCallRequestV03 setMarginDetailsDueToB(MarginCall1 marginDetailsDueToB) {
		this.marginDetailsDueToB = marginDetailsDueToB;
		return this;
	}

	public Optional<MarginRequirement1Choice> getRequirementDetailsDueToA() {
		return requirementDetailsDueToA == null ? Optional.empty() : Optional.of(requirementDetailsDueToA);
	}

	public MarginCallRequestV03 setRequirementDetailsDueToA(MarginRequirement1Choice requirementDetailsDueToA) {
		this.requirementDetailsDueToA = requirementDetailsDueToA;
		return this;
	}

	public Optional<MarginRequirement1Choice> getRequirementDetailsDueToB() {
		return requirementDetailsDueToB == null ? Optional.empty() : Optional.of(requirementDetailsDueToB);
	}

	public MarginCallRequestV03 setRequirementDetailsDueToB(MarginRequirement1Choice requirementDetailsDueToB) {
		this.requirementDetailsDueToB = requirementDetailsDueToB;
		return this;
	}

	public MarginCallResult3 getMarginCallResult() {
		return marginCallResult;
	}

	public MarginCallRequestV03 setMarginCallResult(MarginCallResult3 marginCallResult) {
		this.marginCallResult = Objects.requireNonNull(marginCallResult);
		return this;
	}

	public Optional<ExpectedCollateral1Choice> getExpectedCollateralDueToB() {
		return expectedCollateralDueToB == null ? Optional.empty() : Optional.of(expectedCollateralDueToB);
	}

	public MarginCallRequestV03 setExpectedCollateralDueToB(ExpectedCollateral1Choice expectedCollateralDueToB) {
		this.expectedCollateralDueToB = expectedCollateralDueToB;
		return this;
	}

	public Optional<ExpectedCollateral1Choice> getExpectedCollateralDueToA() {
		return expectedCollateralDueToA == null ? Optional.empty() : Optional.of(expectedCollateralDueToA);
	}

	public MarginCallRequestV03 setExpectedCollateralDueToA(ExpectedCollateral1Choice expectedCollateralDueToA) {
		this.expectedCollateralDueToA = expectedCollateralDueToA;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MarginCallRequestV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.003.001.03")
	static public class Document {
		@XmlElement(name = "MrgnCallReq", required = true)
		public MarginCallRequestV03 messageBody;
	}
}