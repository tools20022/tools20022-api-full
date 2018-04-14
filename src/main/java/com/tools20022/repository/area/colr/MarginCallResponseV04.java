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
import com.tools20022.repository.choice.AgreedAmount1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CollateralManagementISOLatestversion;
import com.tools20022.repository.msgset.CollateralManagementMaintenance20162017;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MarginCallResponse message is sent by the collateral giver or its
 * collateral manager to the collateral taker or its collateral manager or vice
 * versa. This is a response to the MarginCallRequest message. The margin call
 * can be accepted, fully disputed or partially disputed.<br>
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
 * messageDefinitionIdentifier} = {@code colr.004.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
 * CollateralManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmTransactionIdentification
 * MarginCallResponseV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmObligation
 * MarginCallResponseV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmAgreement
 * MarginCallResponseV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmMarginDetailsDueToA
 * MarginCallResponseV04.mmMarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmMarginDetailsDueToB
 * MarginCallResponseV04.mmMarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmAgreedAmountDueToA
 * MarginCallResponseV04.mmAgreedAmountDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmAgreedAmountDueToB
 * MarginCallResponseV04.mmAgreedAmountDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmResponseDetails
 * MarginCallResponseV04.mmResponseDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmSupplementaryData
 * MarginCallResponseV04.mmSupplementaryData}</li>
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
 * xmlTag} = "MrgnCallRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCallResponseV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MarginCallResponse message is sent by the collateral giver or its collateral manager to the collateral taker or its collateral manager or vice versa. This is a response to the MarginCallRequest message. The margin call can be accepted, fully disputed or partially disputed.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral giver the MarginCallResponse message is used to:\r\n- fully accept the MarginCallRequest\r\n- or partially accept the MarginCallRequest.\r\n\r\nWhen sent by the collateral taker the MarginCallResponse message is used to:\r\n- fully accept the recall of collateral\r\n- or partially accept the recall of collateral."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03
 * MarginCallResponseV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginCallResponseV04", propOrder = {"transactionIdentification", "obligation", "agreement", "marginDetailsDueToA", "marginDetailsDueToB", "agreedAmountDueToA", "agreedAmountDueToB", "responseDetails", "supplementaryData"})
public class MarginCallResponseV04 {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmTransactionIdentification
	 * MarginCallResponseV03.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV04, Max35Text> mmTransactionIdentification = new MMMessageBuildingBlock<MarginCallResponseV04, Max35Text>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			previousVersion_lazy = () -> MarginCallResponseV03.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MarginCallResponseV04 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(MarginCallResponseV04 obj, Max35Text value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmObligation
	 * MarginCallResponseV03.mmObligation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV04, Obligation4> mmObligation = new MMMessageBuildingBlock<MarginCallResponseV04, Obligation4>() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			previousVersion_lazy = () -> MarginCallResponseV03.mmObligation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation4.mmObject();
		}

		@Override
		public Obligation4 getValue(MarginCallResponseV04 obj) {
			return obj.getObligation();
		}

		@Override
		public void setValue(MarginCallResponseV04 obj, Obligation4 value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement details for the over the counter market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmAgreement
	 * MarginCallResponseV03.mmAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV04, Optional<Agreement4>> mmAgreement = new MMMessageBuildingBlock<MarginCallResponseV04, Optional<Agreement4>>() {
		{
			xmlTag = "Agrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			previousVersion_lazy = () -> MarginCallResponseV03.mmAgreement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Agreement4.mmObject();
		}

		@Override
		public Optional<Agreement4> getValue(MarginCallResponseV04 obj) {
			return obj.getAgreement();
		}

		@Override
		public void setValue(MarginCallResponseV04 obj, Optional<Agreement4> value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmMarginDetailsDueToA
	 * MarginCallResponseV03.mmMarginDetailsDueToA}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV04, Optional<MarginCall1>> mmMarginDetailsDueToA = new MMMessageBuildingBlock<MarginCallResponseV04, Optional<MarginCall1>>() {
		{
			xmlTag = "MrgnDtlsDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToA";
			definition = "Provides details about the margin calculation that would be due to party A.";
			previousVersion_lazy = () -> MarginCallResponseV03.mmMarginDetailsDueToA;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCall1.mmObject();
		}

		@Override
		public Optional<MarginCall1> getValue(MarginCallResponseV04 obj) {
			return obj.getMarginDetailsDueToA();
		}

		@Override
		public void setValue(MarginCallResponseV04 obj, Optional<MarginCall1> value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmMarginDetailsDueToB
	 * MarginCallResponseV03.mmMarginDetailsDueToB}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV04, Optional<MarginCall1>> mmMarginDetailsDueToB = new MMMessageBuildingBlock<MarginCallResponseV04, Optional<MarginCall1>>() {
		{
			xmlTag = "MrgnDtlsDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetailsDueToB";
			definition = "Provides details about the margin calculation that would be due to party B.";
			previousVersion_lazy = () -> MarginCallResponseV03.mmMarginDetailsDueToB;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarginCall1.mmObject();
		}

		@Override
		public Optional<MarginCall1> getValue(MarginCallResponseV04 obj) {
			return obj.getMarginDetailsDueToB();
		}

		@Override
		public void setValue(MarginCallResponseV04 obj, Optional<MarginCall1> value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmAgreedAmountDueToA
	 * MarginCallResponseV03.mmAgreedAmountDueToA}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV04, Optional<AgreedAmount1Choice>> mmAgreedAmountDueToA = new MMMessageBuildingBlock<MarginCallResponseV04, Optional<AgreedAmount1Choice>>() {
		{
			xmlTag = "AgrdAmtDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedAmountDueToA";
			definition = "Provides details about the agreed amount that would be due to party A.";
			previousVersion_lazy = () -> MarginCallResponseV03.mmAgreedAmountDueToA;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AgreedAmount1Choice.mmObject();
		}

		@Override
		public Optional<AgreedAmount1Choice> getValue(MarginCallResponseV04 obj) {
			return obj.getAgreedAmountDueToA();
		}

		@Override
		public void setValue(MarginCallResponseV04 obj, Optional<AgreedAmount1Choice> value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmAgreedAmountDueToB
	 * MarginCallResponseV03.mmAgreedAmountDueToB}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV04, Optional<AgreedAmount1Choice>> mmAgreedAmountDueToB = new MMMessageBuildingBlock<MarginCallResponseV04, Optional<AgreedAmount1Choice>>() {
		{
			xmlTag = "AgrdAmtDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedAmountDueToB";
			definition = "Provides details about the agreed amount that would be due to party B.";
			previousVersion_lazy = () -> MarginCallResponseV03.mmAgreedAmountDueToB;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AgreedAmount1Choice.mmObject();
		}

		@Override
		public Optional<AgreedAmount1Choice> getValue(MarginCallResponseV04 obj) {
			return obj.getAgreedAmountDueToB();
		}

		@Override
		public void setValue(MarginCallResponseV04 obj, Optional<AgreedAmount1Choice> value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmResponseDetails
	 * MarginCallResponseV03.mmResponseDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV04, Optional<Response1>> mmResponseDetails = new MMMessageBuildingBlock<MarginCallResponseV04, Optional<Response1>>() {
		{
			xmlTag = "RspnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseDetails";
			definition = "Provides response details about the margin call.";
			previousVersion_lazy = () -> MarginCallResponseV03.mmResponseDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Response1.mmObject();
		}

		@Override
		public Optional<Response1> getValue(MarginCallResponseV04 obj) {
			return obj.getResponseDetails();
		}

		@Override
		public void setValue(MarginCallResponseV04 obj, Optional<Response1> value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmSupplementaryData
	 * MarginCallResponseV03.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MarginCallResponseV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MarginCallResponseV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			previousVersion_lazy = () -> MarginCallResponseV03.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MarginCallResponseV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MarginCallResponseV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCallResponseV04";
				definition = "Scope\r\nThe MarginCallResponse message is sent by the collateral giver or its collateral manager to the collateral taker or its collateral manager or vice versa. This is a response to the MarginCallRequest message. The margin call can be accepted, fully disputed or partially disputed.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral giver the MarginCallResponse message is used to:\r\n- fully accept the MarginCallRequest\r\n- or partially accept the MarginCallRequest.\r\n\r\nWhen sent by the collateral taker the MarginCallResponse message is used to:\r\n- fully accept the recall of collateral\r\n- or partially accept the recall of collateral.";
				previousVersion_lazy = () -> MarginCallResponseV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(CollateralManagementISOLatestversion.mmObject(), CollateralManagementMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "MrgnCallRspn";
				businessArea_lazy = () -> CollateralManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.MarginCallResponseV04.mmTransactionIdentification, com.tools20022.repository.area.colr.MarginCallResponseV04.mmObligation,
						com.tools20022.repository.area.colr.MarginCallResponseV04.mmAgreement, com.tools20022.repository.area.colr.MarginCallResponseV04.mmMarginDetailsDueToA,
						com.tools20022.repository.area.colr.MarginCallResponseV04.mmMarginDetailsDueToB, com.tools20022.repository.area.colr.MarginCallResponseV04.mmAgreedAmountDueToA,
						com.tools20022.repository.area.colr.MarginCallResponseV04.mmAgreedAmountDueToB, com.tools20022.repository.area.colr.MarginCallResponseV04.mmResponseDetails,
						com.tools20022.repository.area.colr.MarginCallResponseV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "004";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarginCallResponseV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public MarginCallResponseV04 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Obligation4 getObligation() {
		return obligation;
	}

	public MarginCallResponseV04 setObligation(Obligation4 obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public Optional<Agreement4> getAgreement() {
		return agreement == null ? Optional.empty() : Optional.of(agreement);
	}

	public MarginCallResponseV04 setAgreement(Agreement4 agreement) {
		this.agreement = agreement;
		return this;
	}

	public Optional<MarginCall1> getMarginDetailsDueToA() {
		return marginDetailsDueToA == null ? Optional.empty() : Optional.of(marginDetailsDueToA);
	}

	public MarginCallResponseV04 setMarginDetailsDueToA(MarginCall1 marginDetailsDueToA) {
		this.marginDetailsDueToA = marginDetailsDueToA;
		return this;
	}

	public Optional<MarginCall1> getMarginDetailsDueToB() {
		return marginDetailsDueToB == null ? Optional.empty() : Optional.of(marginDetailsDueToB);
	}

	public MarginCallResponseV04 setMarginDetailsDueToB(MarginCall1 marginDetailsDueToB) {
		this.marginDetailsDueToB = marginDetailsDueToB;
		return this;
	}

	public Optional<AgreedAmount1Choice> getAgreedAmountDueToA() {
		return agreedAmountDueToA == null ? Optional.empty() : Optional.of(agreedAmountDueToA);
	}

	public MarginCallResponseV04 setAgreedAmountDueToA(AgreedAmount1Choice agreedAmountDueToA) {
		this.agreedAmountDueToA = agreedAmountDueToA;
		return this;
	}

	public Optional<AgreedAmount1Choice> getAgreedAmountDueToB() {
		return agreedAmountDueToB == null ? Optional.empty() : Optional.of(agreedAmountDueToB);
	}

	public MarginCallResponseV04 setAgreedAmountDueToB(AgreedAmount1Choice agreedAmountDueToB) {
		this.agreedAmountDueToB = agreedAmountDueToB;
		return this;
	}

	public Optional<Response1> getResponseDetails() {
		return responseDetails == null ? Optional.empty() : Optional.of(responseDetails);
	}

	public MarginCallResponseV04 setResponseDetails(Response1 responseDetails) {
		this.responseDetails = responseDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MarginCallResponseV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.004.001.04")
	static public class Document {
		@XmlElement(name = "MrgnCallRspn", required = true)
		public MarginCallResponseV04 messageBody;
	}
}