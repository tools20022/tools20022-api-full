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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * - request the return of collateral
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.003.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementPreviousVersion
 * CollateralManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementISOPreviousversion
 * CollateralManagementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MrgnCallReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCallRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MarginCallRequest message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager\r\nThis message is used to request new collateral at the initiation of an exposure or request additional collateral for an existing exposure. It can also be used to recall collateral upon the collateral giver or its collateral manager's request.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral taker the MarginCallRequest message is used to:\r\n- request new collateral at the initiation of an exposure\r\n- request additional collateral\r\nWhen sent by the collateral giver the MarginCallRequest message is used to:\r\n- request the return of collateral"
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
public class MarginCallRequestV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Max35Text transactionIdentification;
	/**
	 * Unambiguous identification of the transaction as know by the instructing
	 * party.
	 * <p>
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
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
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
	};
	protected Obligation3 obligation;
	/**
	 * Provides information like the identification of the party or parties
	 * associated with the collateral agreement, the exposure type and the
	 * valuation date.
	 * <p>
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
	public static final MMMessageBuildingBlock mmObligation = new MMMessageBuildingBlock() {
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
	};
	protected Agreement2 agreement;
	/**
	 * Agreement details for the over the counter market.
	 * <p>
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
	public static final MMMessageBuildingBlock mmAgreement = new MMMessageBuildingBlock() {
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
	};
	protected MarginCall1 marginDetailsDueToA;
	/**
	 * Provides details about the margin calculation that would be due to party
	 * A.
	 * <p>
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
	public static final MMMessageBuildingBlock mmMarginDetailsDueToA = new MMMessageBuildingBlock() {
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
	};
	protected MarginCall1 marginDetailsDueToB;
	/**
	 * Provides details about the margin calculation that would be due to party
	 * B.
	 * <p>
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
	public static final MMMessageBuildingBlock mmMarginDetailsDueToB = new MMMessageBuildingBlock() {
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
	};
	protected MarginRequirement1Choice requirementDetailsDueToA;
	/**
	 * Amount of expected margin that will be either delivered to party A by
	 * party B or recalled to party A from party B.
	 * <p>
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
	public static final MMMessageBuildingBlock mmRequirementDetailsDueToA = new MMMessageBuildingBlock() {
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
	};
	protected MarginRequirement1Choice requirementDetailsDueToB;
	/**
	 * Amount of expected margin that will be either delivered to party B by
	 * party A or recalled to party B from party A.
	 * <p>
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
	public static final MMMessageBuildingBlock mmRequirementDetailsDueToB = new MMMessageBuildingBlock() {
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
	};
	protected MarginCallResult3 marginCallResult;
	/**
	 * Summation of the call amounts per margin type. It is provided for the
	 * purposes of carrying forward for future messages that are used to compare
	 * the margin call results to determine whether a call is agreed or
	 * full/partially disputed.
	 * <p>
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
	public static final MMMessageBuildingBlock mmMarginCallResult = new MMMessageBuildingBlock() {
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
	};
	protected ExpectedCollateral1Choice expectedCollateralDueToB;
	/**
	 * Provides details about the type of collateral that will be either
	 * delivered to party B by party A or recalled to party B from party A.
	 * <p>
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
	public static final MMMessageBuildingBlock mmExpectedCollateralDueToB = new MMMessageBuildingBlock() {
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
	};
	protected ExpectedCollateral1Choice expectedCollateralDueToA;
	/**
	 * Provides details about the type of collateral that will be either
	 * delivered to party A by party B or recalled to party A from party B.
	 * <p>
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
	public static final MMMessageBuildingBlock mmExpectedCollateralDueToA = new MMMessageBuildingBlock() {
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
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
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
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCallRequestV03";
				definition = "Scope\r\nThe MarginCallRequest message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager\r\nThis message is used to request new collateral at the initiation of an exposure or request additional collateral for an existing exposure. It can also be used to recall collateral upon the collateral giver or its collateral manager's request.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral taker the MarginCallRequest message is used to:\r\n- request new collateral at the initiation of an exposure\r\n- request additional collateral\r\nWhen sent by the collateral giver the MarginCallRequest message is used to:\r\n- request the return of collateral";
				nextVersions_lazy = () -> Arrays.asList(MarginCallRequestV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject(), CollateralManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "MrgnCallReq";
				businessArea_lazy = () -> CollateralManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginCallRequestV03.mmTransactionIdentification, MarginCallRequestV03.mmObligation, MarginCallRequestV03.mmAgreement, MarginCallRequestV03.mmMarginDetailsDueToA,
						MarginCallRequestV03.mmMarginDetailsDueToB, MarginCallRequestV03.mmRequirementDetailsDueToA, MarginCallRequestV03.mmRequirementDetailsDueToB, MarginCallRequestV03.mmMarginCallResult,
						MarginCallRequestV03.mmExpectedCollateralDueToB, MarginCallRequestV03.mmExpectedCollateralDueToA, MarginCallRequestV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "003";
						version = "03";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public Obligation3 getObligation() {
		return obligation;
	}

	public void setObligation(Obligation3 obligation) {
		this.obligation = obligation;
	}

	public Agreement2 getAgreement() {
		return agreement;
	}

	public void setAgreement(Agreement2 agreement) {
		this.agreement = agreement;
	}

	public MarginCall1 getMarginDetailsDueToA() {
		return marginDetailsDueToA;
	}

	public void setMarginDetailsDueToA(MarginCall1 marginDetailsDueToA) {
		this.marginDetailsDueToA = marginDetailsDueToA;
	}

	public MarginCall1 getMarginDetailsDueToB() {
		return marginDetailsDueToB;
	}

	public void setMarginDetailsDueToB(MarginCall1 marginDetailsDueToB) {
		this.marginDetailsDueToB = marginDetailsDueToB;
	}

	public MarginRequirement1Choice getRequirementDetailsDueToA() {
		return requirementDetailsDueToA;
	}

	public void setRequirementDetailsDueToA(MarginRequirement1Choice requirementDetailsDueToA) {
		this.requirementDetailsDueToA = requirementDetailsDueToA;
	}

	public MarginRequirement1Choice getRequirementDetailsDueToB() {
		return requirementDetailsDueToB;
	}

	public void setRequirementDetailsDueToB(MarginRequirement1Choice requirementDetailsDueToB) {
		this.requirementDetailsDueToB = requirementDetailsDueToB;
	}

	public MarginCallResult3 getMarginCallResult() {
		return marginCallResult;
	}

	public void setMarginCallResult(MarginCallResult3 marginCallResult) {
		this.marginCallResult = marginCallResult;
	}

	public ExpectedCollateral1Choice getExpectedCollateralDueToB() {
		return expectedCollateralDueToB;
	}

	public void setExpectedCollateralDueToB(ExpectedCollateral1Choice expectedCollateralDueToB) {
		this.expectedCollateralDueToB = expectedCollateralDueToB;
	}

	public ExpectedCollateral1Choice getExpectedCollateralDueToA() {
		return expectedCollateralDueToA;
	}

	public void setExpectedCollateralDueToA(ExpectedCollateral1Choice expectedCollateralDueToA) {
		this.expectedCollateralDueToA = expectedCollateralDueToA;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}