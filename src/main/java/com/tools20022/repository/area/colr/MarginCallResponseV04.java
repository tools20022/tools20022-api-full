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
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
 * CollateralManagementLatestVersion}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MrgnCallRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.004.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCallResponseV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MarginCallResponse message is sent by the collateral giver or its collateral manager to the collateral taker or its collateral manager or vice versa. This is a response to the MarginCallRequest message. The margin call can be accepted, fully disputed or partially disputed.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nWhen sent by the collateral giver the MarginCallResponse message is used to:\r\n- fully accept the MarginCallRequest\r\n- or partially accept the MarginCallRequest.\r\n\r\nWhen sent by the collateral taker the MarginCallResponse message is used to:\r\n- fully accept the recall of collateral\r\n- or partially accept the recall of collateral."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03
 * MarginCallResponseV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MarginCallResponseV04", propOrder = {"transactionIdentification", "obligation", "agreement", "marginDetailsDueToA", "marginDetailsDueToB", "agreedAmountDueToA", "agreedAmountDueToB", "responseDetails", "supplementaryData"})
public class MarginCallResponseV04 {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmTransactionIdentification
	 * MarginCallResponseV03.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
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

		public Method getGetterMethod() {
			try {
				return MarginCallResponseV04.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Obligation4 obligation;
	/**
	 * Provides information like the identification of the party or parties
	 * associated with the collateral agreement, the exposure type and the
	 * valuation date.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmObligation
	 * MarginCallResponseV03.mmObligation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmObligation = new MMMessageBuildingBlock() {
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

		public Method getGetterMethod() {
			try {
				return MarginCallResponseV04.class.getMethod("getObligation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Agreement4 agreement;
	/**
	 * Agreement details for the over the counter market.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmAgreement
	 * MarginCallResponseV03.mmAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgreement = new MMMessageBuildingBlock() {
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

		public Method getGetterMethod() {
			try {
				return MarginCallResponseV04.class.getMethod("getAgreement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmMarginDetailsDueToA
	 * MarginCallResponseV03.mmMarginDetailsDueToA}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarginDetailsDueToA = new MMMessageBuildingBlock() {
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

		public Method getGetterMethod() {
			try {
				return MarginCallResponseV04.class.getMethod("getMarginDetailsDueToA", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmMarginDetailsDueToB
	 * MarginCallResponseV03.mmMarginDetailsDueToB}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarginDetailsDueToB = new MMMessageBuildingBlock() {
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

		public Method getGetterMethod() {
			try {
				return MarginCallResponseV04.class.getMethod("getMarginDetailsDueToB", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AgreedAmount1Choice agreedAmountDueToA;
	/**
	 * Provides details about the agreed amount that would be due to party A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AgreedAmount1Choice
	 * AgreedAmount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrdAmtDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedAmountDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the agreed amount that would be due to party A."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmAgreedAmountDueToA
	 * MarginCallResponseV03.mmAgreedAmountDueToA}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgreedAmountDueToA = new MMMessageBuildingBlock() {
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

		public Method getGetterMethod() {
			try {
				return MarginCallResponseV04.class.getMethod("getAgreedAmountDueToA", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AgreedAmount1Choice agreedAmountDueToB;
	/**
	 * Provides details about the agreed amount that would be due to party B.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AgreedAmount1Choice
	 * AgreedAmount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrdAmtDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedAmountDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the agreed amount that would be due to party B."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmAgreedAmountDueToB
	 * MarginCallResponseV03.mmAgreedAmountDueToB}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgreedAmountDueToB = new MMMessageBuildingBlock() {
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

		public Method getGetterMethod() {
			try {
				return MarginCallResponseV04.class.getMethod("getAgreedAmountDueToB", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Response1 responseDetails;
	/**
	 * Provides response details about the margin call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Response1
	 * Response1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides response details about the margin call."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmResponseDetails
	 * MarginCallResponseV03.mmResponseDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmResponseDetails = new MMMessageBuildingBlock() {
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

		public Method getGetterMethod() {
			try {
				return MarginCallResponseV04.class.getMethod("getResponseDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmSupplementaryData
	 * MarginCallResponseV03.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			previousVersion_lazy = () -> MarginCallResponseV03.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCallResponseV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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

	@XmlElement(name = "TxId", required = true)
	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "Oblgtn", required = true)
	public Obligation4 getObligation() {
		return obligation;
	}

	public void setObligation(Obligation4 obligation) {
		this.obligation = obligation;
	}

	@XmlElement(name = "Agrmt")
	public Agreement4 getAgreement() {
		return agreement;
	}

	public void setAgreement(Agreement4 agreement) {
		this.agreement = agreement;
	}

	@XmlElement(name = "MrgnDtlsDueToA")
	public MarginCall1 getMarginDetailsDueToA() {
		return marginDetailsDueToA;
	}

	public void setMarginDetailsDueToA(MarginCall1 marginDetailsDueToA) {
		this.marginDetailsDueToA = marginDetailsDueToA;
	}

	@XmlElement(name = "MrgnDtlsDueToB")
	public MarginCall1 getMarginDetailsDueToB() {
		return marginDetailsDueToB;
	}

	public void setMarginDetailsDueToB(MarginCall1 marginDetailsDueToB) {
		this.marginDetailsDueToB = marginDetailsDueToB;
	}

	@XmlElement(name = "AgrdAmtDueToA")
	public AgreedAmount1Choice getAgreedAmountDueToA() {
		return agreedAmountDueToA;
	}

	public void setAgreedAmountDueToA(AgreedAmount1Choice agreedAmountDueToA) {
		this.agreedAmountDueToA = agreedAmountDueToA;
	}

	@XmlElement(name = "AgrdAmtDueToB")
	public AgreedAmount1Choice getAgreedAmountDueToB() {
		return agreedAmountDueToB;
	}

	public void setAgreedAmountDueToB(AgreedAmount1Choice agreedAmountDueToB) {
		this.agreedAmountDueToB = agreedAmountDueToB;
	}

	@XmlElement(name = "RspnDtls")
	public Response1 getResponseDetails() {
		return responseDetails;
	}

	public void setResponseDetails(Response1 responseDetails) {
		this.responseDetails = responseDetails;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.004.04.04")
	static public class Document {
		@XmlElement(name = "MrgnCallRspn", required = true)
		public MarginCallResponseV04 messageBody;
	}
}