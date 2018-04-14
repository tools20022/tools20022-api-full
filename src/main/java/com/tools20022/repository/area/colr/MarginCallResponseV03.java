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
import com.tools20022.repository.choice.AgreedAmount1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CollateralManagementISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by the collateral giver or its collateral manager to the
 * collateral taker or its collateral manager or vice versa. This is a response
 * to the MarginCallRequest message. The margin call can be accepted, fully
 * disputed or partially disputed.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * When sent by the collateral giver the MarginCallResponse message is used to:<br>
 * - fully accept the MarginCallRequest<br>
 * - or partially accept the MarginCallRequest.<br>
 * <br>
 * When sent by the collateral taker the MarginCallResponse message is used to:<br>
 * - fully accept the recall of collateral<br>
 * - or partially accept the recall of collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.004.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementPreviousVersion
 * CollateralManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmTransactionIdentification
 * MarginCallResponseV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmObligation
 * MarginCallResponseV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmAgreement
 * MarginCallResponseV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmMarginDetailsDueToA
 * MarginCallResponseV03.mmMarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmMarginDetailsDueToB
 * MarginCallResponseV03.mmMarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmAgreedAmountDueToA
 * MarginCallResponseV03.mmAgreedAmountDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmAgreedAmountDueToB
 * MarginCallResponseV03.mmAgreedAmountDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmResponseDetails
 * MarginCallResponseV03.mmResponseDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmSupplementaryData
 * MarginCallResponseV03.mmSupplementaryData}</li>
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
 * xmlTag} = "MrgnCallRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCallResponseV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by the collateral giver or its collateral manager to the collateral taker or its collateral manager or vice versa. This is a response to the MarginCallRequest message. The margin call can be accepted, fully disputed or partially disputed.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral giver the MarginCallResponse message is used to:\r\n- fully accept the MarginCallRequest\r\n- or partially accept the MarginCallRequest.\r\n\r\nWhen sent by the collateral taker the MarginCallResponse message is used to:\r\n- fully accept the recall of collateral\r\n- or partially accept the recall of collateral."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04
 * MarginCallResponseV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginCallResponseV03", propOrder = {"transactionIdentification", "obligation", "agreement", "marginDetailsDueToA", "marginDetailsDueToB", "agreedAmountDueToA", "agreedAmountDueToB", "responseDetails", "supplementaryData"})
public class MarginCallResponseV03 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as know by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmTransactionIdentification
	 * MarginCallResponseV04.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV03, Max35Text> mmTransactionIdentification = new MMMessageBuildingBlock<MarginCallResponseV03, Max35Text>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallResponseV04.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MarginCallResponseV03 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(MarginCallResponseV03 obj, Max35Text value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmObligation
	 * MarginCallResponseV04.mmObligation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV03, Obligation3> mmObligation = new MMMessageBuildingBlock<MarginCallResponseV03, Obligation3>() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallResponseV04.mmObligation);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation3.mmObject();
		}

		@Override
		public Obligation3 getValue(MarginCallResponseV03 obj) {
			return obj.getObligation();
		}

		@Override
		public void setValue(MarginCallResponseV03 obj, Obligation3 value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement details for the over the counter market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmAgreement
	 * MarginCallResponseV04.mmAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV03, Optional<Agreement2>> mmAgreement = new MMMessageBuildingBlock<MarginCallResponseV03, Optional<Agreement2>>() {
		{
			xmlTag = "Agrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallResponseV04.mmAgreement);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Agreement2.mmObject();
		}

		@Override
		public Optional<Agreement2> getValue(MarginCallResponseV03 obj) {
			return obj.getAgreement();
		}

		@Override
		public void setValue(MarginCallResponseV03 obj, Optional<Agreement2> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginDetailsDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin calculation that would be due to party A."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmMarginDetailsDueToA
	 * MarginCallResponseV04.mmMarginDetailsDueToA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV03, Optional<MarginCall1>> mmMarginDetailsDueToA = new MMMessageBuildingBlock<MarginCallResponseV03, Optional<MarginCall1>>() {
		{
			xmlTag = "MrgnDtlsDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToA";
			definition = "Provides details about the margin calculation that would be due to party A.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallResponseV04.mmMarginDetailsDueToA);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCall1.mmObject();
		}

		@Override
		public Optional<MarginCall1> getValue(MarginCallResponseV03 obj) {
			return obj.getMarginDetailsDueToA();
		}

		@Override
		public void setValue(MarginCallResponseV03 obj, Optional<MarginCall1> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginDetailsDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the margin calculation that would be due to party B."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmMarginDetailsDueToB
	 * MarginCallResponseV04.mmMarginDetailsDueToB}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV03, Optional<MarginCall1>> mmMarginDetailsDueToB = new MMMessageBuildingBlock<MarginCallResponseV03, Optional<MarginCall1>>() {
		{
			xmlTag = "MrgnDtlsDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToB";
			definition = "Provides details about the margin calculation that would be due to party B.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallResponseV04.mmMarginDetailsDueToB);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCall1.mmObject();
		}

		@Override
		public Optional<MarginCall1> getValue(MarginCallResponseV03 obj) {
			return obj.getMarginDetailsDueToB();
		}

		@Override
		public void setValue(MarginCallResponseV03 obj, Optional<MarginCall1> value) {
			obj.setMarginDetailsDueToB(value.orElse(null));
		}
	};
	@XmlElement(name = "AgrdAmtDueToA")
	protected AgreedAmount1Choice agreedAmountDueToA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AgreedAmount1Choice
	 * AgreedAmount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrdAmtDueToA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedAmountDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the agreed amount that would be due to party A."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmAgreedAmountDueToA
	 * MarginCallResponseV04.mmAgreedAmountDueToA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV03, Optional<AgreedAmount1Choice>> mmAgreedAmountDueToA = new MMMessageBuildingBlock<MarginCallResponseV03, Optional<AgreedAmount1Choice>>() {
		{
			xmlTag = "AgrdAmtDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedAmountDueToA";
			definition = "Provides details about the agreed amount that would be due to party A.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallResponseV04.mmAgreedAmountDueToA);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AgreedAmount1Choice.mmObject();
		}

		@Override
		public Optional<AgreedAmount1Choice> getValue(MarginCallResponseV03 obj) {
			return obj.getAgreedAmountDueToA();
		}

		@Override
		public void setValue(MarginCallResponseV03 obj, Optional<AgreedAmount1Choice> value) {
			obj.setAgreedAmountDueToA(value.orElse(null));
		}
	};
	@XmlElement(name = "AgrdAmtDueToB")
	protected AgreedAmount1Choice agreedAmountDueToB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AgreedAmount1Choice
	 * AgreedAmount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrdAmtDueToB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedAmountDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the agreed amount that would be due to party B."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmAgreedAmountDueToB
	 * MarginCallResponseV04.mmAgreedAmountDueToB}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV03, Optional<AgreedAmount1Choice>> mmAgreedAmountDueToB = new MMMessageBuildingBlock<MarginCallResponseV03, Optional<AgreedAmount1Choice>>() {
		{
			xmlTag = "AgrdAmtDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedAmountDueToB";
			definition = "Provides details about the agreed amount that would be due to party B.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallResponseV04.mmAgreedAmountDueToB);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AgreedAmount1Choice.mmObject();
		}

		@Override
		public Optional<AgreedAmount1Choice> getValue(MarginCallResponseV03 obj) {
			return obj.getAgreedAmountDueToB();
		}

		@Override
		public void setValue(MarginCallResponseV03 obj, Optional<AgreedAmount1Choice> value) {
			obj.setAgreedAmountDueToB(value.orElse(null));
		}
	};
	@XmlElement(name = "RspnDtls")
	protected Response1 responseDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Response1
	 * Response1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides response details about the margin call."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmResponseDetails
	 * MarginCallResponseV04.mmResponseDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV03, Optional<Response1>> mmResponseDetails = new MMMessageBuildingBlock<MarginCallResponseV03, Optional<Response1>>() {
		{
			xmlTag = "RspnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDetails";
			definition = "Provides response details about the margin call.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallResponseV04.mmResponseDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Response1.mmObject();
		}

		@Override
		public Optional<Response1> getValue(MarginCallResponseV03 obj) {
			return obj.getResponseDetails();
		}

		@Override
		public void setValue(MarginCallResponseV03 obj, Optional<Response1> value) {
			obj.setResponseDetails(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmSupplementaryData
	 * MarginCallResponseV04.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MarginCallResponseV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(MarginCallResponseV04.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MarginCallResponseV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MarginCallResponseV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCallResponseV03";
				definition = "Scope\r\nThis message is sent by the collateral giver or its collateral manager to the collateral taker or its collateral manager or vice versa. This is a response to the MarginCallRequest message. The margin call can be accepted, fully disputed or partially disputed.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral giver the MarginCallResponse message is used to:\r\n- fully accept the MarginCallRequest\r\n- or partially accept the MarginCallRequest.\r\n\r\nWhen sent by the collateral taker the MarginCallResponse message is used to:\r\n- fully accept the recall of collateral\r\n- or partially accept the recall of collateral.";
				nextVersions_lazy = () -> Arrays.asList(MarginCallResponseV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject(), CollateralManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "MrgnCallRspn";
				businessArea_lazy = () -> CollateralManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.MarginCallResponseV03.mmTransactionIdentification, com.tools20022.repository.area.colr.MarginCallResponseV03.mmObligation,
						com.tools20022.repository.area.colr.MarginCallResponseV03.mmAgreement, com.tools20022.repository.area.colr.MarginCallResponseV03.mmMarginDetailsDueToA,
						com.tools20022.repository.area.colr.MarginCallResponseV03.mmMarginDetailsDueToB, com.tools20022.repository.area.colr.MarginCallResponseV03.mmAgreedAmountDueToA,
						com.tools20022.repository.area.colr.MarginCallResponseV03.mmAgreedAmountDueToB, com.tools20022.repository.area.colr.MarginCallResponseV03.mmResponseDetails,
						com.tools20022.repository.area.colr.MarginCallResponseV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "004";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarginCallResponseV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public MarginCallResponseV03 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Obligation3 getObligation() {
		return obligation;
	}

	public MarginCallResponseV03 setObligation(Obligation3 obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public Optional<Agreement2> getAgreement() {
		return agreement == null ? Optional.empty() : Optional.of(agreement);
	}

	public MarginCallResponseV03 setAgreement(Agreement2 agreement) {
		this.agreement = agreement;
		return this;
	}

	public Optional<MarginCall1> getMarginDetailsDueToA() {
		return marginDetailsDueToA == null ? Optional.empty() : Optional.of(marginDetailsDueToA);
	}

	public MarginCallResponseV03 setMarginDetailsDueToA(MarginCall1 marginDetailsDueToA) {
		this.marginDetailsDueToA = marginDetailsDueToA;
		return this;
	}

	public Optional<MarginCall1> getMarginDetailsDueToB() {
		return marginDetailsDueToB == null ? Optional.empty() : Optional.of(marginDetailsDueToB);
	}

	public MarginCallResponseV03 setMarginDetailsDueToB(MarginCall1 marginDetailsDueToB) {
		this.marginDetailsDueToB = marginDetailsDueToB;
		return this;
	}

	public Optional<AgreedAmount1Choice> getAgreedAmountDueToA() {
		return agreedAmountDueToA == null ? Optional.empty() : Optional.of(agreedAmountDueToA);
	}

	public MarginCallResponseV03 setAgreedAmountDueToA(AgreedAmount1Choice agreedAmountDueToA) {
		this.agreedAmountDueToA = agreedAmountDueToA;
		return this;
	}

	public Optional<AgreedAmount1Choice> getAgreedAmountDueToB() {
		return agreedAmountDueToB == null ? Optional.empty() : Optional.of(agreedAmountDueToB);
	}

	public MarginCallResponseV03 setAgreedAmountDueToB(AgreedAmount1Choice agreedAmountDueToB) {
		this.agreedAmountDueToB = agreedAmountDueToB;
		return this;
	}

	public Optional<Response1> getResponseDetails() {
		return responseDetails == null ? Optional.empty() : Optional.of(responseDetails);
	}

	public MarginCallResponseV03 setResponseDetails(Response1 responseDetails) {
		this.responseDetails = responseDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MarginCallResponseV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.004.001.03")
	static public class Document {
		@XmlElement(name = "MrgnCallRspn", required = true)
		public MarginCallResponseV03 messageBody;
	}
}