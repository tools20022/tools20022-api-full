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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.Status6Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.entity.StatusOriginator;
import com.tools20022.repository.entity.TreasuryTradeSettlementStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information on the status of a trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData6#mmNotificationIdentification
 * TradeData6.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData6#mmMatchingSystemUniqueReference
 * TradeData6.mmMatchingSystemUniqueReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData6#mmMatchingSystemMatchingReference
 * TradeData6.mmMatchingSystemMatchingReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData6#mmStatusOriginator
 * TradeData6.mmStatusOriginator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData6#mmCurrentStatus
 * TradeData6.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData6#mmCurrentStatusSubType
 * TradeData6.mmCurrentStatusSubType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData6#mmCurrentStatusDateTime
 * TradeData6.mmCurrentStatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData6#mmPreviousStatus
 * TradeData6.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData6#mmPreviousStatusSubType
 * TradeData6.mmPreviousStatusSubType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData6#mmPreviousStatusDateTime
 * TradeData6.mmPreviousStatusDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData6#mmProductType
 * TradeData6.mmProductType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeData6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information on the status of a trade."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData7 TradeData7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TradeData6", propOrder = {"notificationIdentification", "matchingSystemUniqueReference", "matchingSystemMatchingReference", "statusOriginator", "currentStatus", "currentStatusSubType", "currentStatusDateTime",
		"previousStatus", "previousStatusSubType", "previousStatusDateTime", "productType"})
public class TradeData6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text notificationIdentification;
	/**
	 * Reference to the identification of the notification for which the status
	 * is given, as assigned by the participant that submitted the foreign
	 * exchange or derivative trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData6
	 * TradeData6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of the notification for which the status is given, as assigned by the participant that submitted the foreign exchange or derivative trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotificationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeData6.mmObject();
			isDerived = false;
			xmlTag = "NtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationIdentification";
			definition = "Reference to the identification of the notification for which the status is given, as assigned by the participant that submitted the foreign exchange or derivative trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text matchingSystemUniqueReference;
	/**
	 * Reference to the unique system identification assigned to the trade by
	 * the central matching system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData6
	 * TradeData6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSysUnqRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingSystemUniqueReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the unique system identification assigned to the trade  by the central matching system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingSystemUniqueReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeData6.mmObject();
			isDerived = false;
			xmlTag = "MtchgSysUnqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingSystemUniqueReference";
			definition = "Reference to the unique system identification assigned to the trade  by the central matching system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text matchingSystemMatchingReference;
	/**
	 * Reference to the unique matching identification assigned to the trade and
	 * to the matching trade from the counterparty by the central matching
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData6
	 * TradeData6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSysMtchgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingSystemMatchingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the unique matching identification assigned to the trade and to the matching trade from the counterparty by the central matching system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingSystemMatchingReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeData6.mmObject();
			isDerived = false;
			xmlTag = "MtchgSysMtchgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingSystemMatchingReference";
			definition = "Reference to the unique matching identification assigned to the trade and to the matching trade from the counterparty by the central matching system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text statusOriginator;
	/**
	 * Party that assigned the status to the foreign exchange or derivative
	 * trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusOriginator
	 * StatusOriginator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData6
	 * TradeData6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that assigned the status to the foreign exchange or derivative trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusOriginator = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> StatusOriginator.mmObject();
			componentContext_lazy = () -> TradeData6.mmObject();
			isDerived = false;
			xmlTag = "StsOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOriginator";
			definition = "Party that assigned the status to the foreign exchange or derivative trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Status6Choice currentStatus;
	/**
	 * Specifies the new status of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Status6Choice Status6Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTradeStatus
	 * TreasuryTradeSettlementStatus.mmTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData6
	 * TradeData6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the new status of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> TradeData6.mmObject();
			isDerived = false;
			xmlTag = "CurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatus";
			definition = "Specifies the new status of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Status6Choice.mmObject();
		}
	};
	protected Max70Text currentStatusSubType;
	/**
	 * Additional information on the current status of a trade in a central
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTradeStatus
	 * TreasuryTradeSettlementStatus.mmTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData6
	 * TradeData6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurStsSubTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatusSubType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information on the current status of a trade in a central system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatusSubType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> TradeData6.mmObject();
			isDerived = false;
			xmlTag = "CurStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusSubType";
			definition = "Additional information on the current status of a trade in a central system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected ISODateTime currentStatusDateTime;
	/**
	 * Specifies the date and time at which the current status was assigned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData6
	 * TradeData6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurStsDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time at which the current status was assigned."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatusDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeData6.mmObject();
			isDerived = false;
			xmlTag = "CurStsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusDateTime";
			definition = "Specifies the date and time at which the current status was assigned.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Status6Choice previousStatus;
	/**
	 * Specifies the previous status of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Status6Choice Status6Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData6
	 * TradeData6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the previous status of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeData6.mmObject();
			isDerived = false;
			xmlTag = "PrvsSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatus";
			definition = "Specifies the previous status of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Status6Choice.mmObject();
		}
	};
	protected Max70Text previousStatusSubType;
	/**
	 * Additional information on the previous status of a trade in a central
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData6
	 * TradeData6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsStsSubTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousStatusSubType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information on the previous status of a trade in a central system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousStatusSubType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeData6.mmObject();
			isDerived = false;
			xmlTag = "PrvsStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusSubType";
			definition = "Additional information on the previous status of a trade in a central system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected ISODateTime previousStatusDateTime;
	/**
	 * Specifies the date and time at which the previous status was assigned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData6
	 * TradeData6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsStsDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousStatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time at which the previous status was assigned."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousStatusDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeData6.mmObject();
			isDerived = false;
			xmlTag = "PrvsStsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusDateTime";
			definition = "Specifies the date and time at which the previous status was assigned.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max35Text productType;
	/**
	 * Specifies the product for which the status of the confirmation is
	 * reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmProductCategory
	 * Product.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData6
	 * TradeData6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the product for which the status of the confirmation is reported."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmProductCategory;
			componentContext_lazy = () -> TradeData6.mmObject();
			isDerived = false;
			xmlTag = "PdctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductType";
			definition = "Specifies the product for which the status of the confirmation is reported.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TradeData6.mmNotificationIdentification, TradeData6.mmMatchingSystemUniqueReference, TradeData6.mmMatchingSystemMatchingReference, TradeData6.mmStatusOriginator,
						TradeData6.mmCurrentStatus, TradeData6.mmCurrentStatusSubType, TradeData6.mmCurrentStatusDateTime, TradeData6.mmPreviousStatus, TradeData6.mmPreviousStatusSubType, TradeData6.mmPreviousStatusDateTime,
						TradeData6.mmProductType);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeData6";
				definition = "Provides information on the status of a trade.";
				nextVersions_lazy = () -> Arrays.asList(TradeData7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NtfctnId", required = true)
	public Max35Text getNotificationIdentification() {
		return notificationIdentification;
	}

	public void setNotificationIdentification(Max35Text notificationIdentification) {
		this.notificationIdentification = notificationIdentification;
	}

	@XmlElement(name = "MtchgSysUnqRef", required = true)
	public Max35Text getMatchingSystemUniqueReference() {
		return matchingSystemUniqueReference;
	}

	public void setMatchingSystemUniqueReference(Max35Text matchingSystemUniqueReference) {
		this.matchingSystemUniqueReference = matchingSystemUniqueReference;
	}

	@XmlElement(name = "MtchgSysMtchgRef")
	public Max35Text getMatchingSystemMatchingReference() {
		return matchingSystemMatchingReference;
	}

	public void setMatchingSystemMatchingReference(Max35Text matchingSystemMatchingReference) {
		this.matchingSystemMatchingReference = matchingSystemMatchingReference;
	}

	@XmlElement(name = "StsOrgtr")
	public Max35Text getStatusOriginator() {
		return statusOriginator;
	}

	public void setStatusOriginator(Max35Text statusOriginator) {
		this.statusOriginator = statusOriginator;
	}

	@XmlElement(name = "CurSts", required = true)
	public Status6Choice getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(Status6Choice currentStatus) {
		this.currentStatus = currentStatus;
	}

	@XmlElement(name = "CurStsSubTp")
	public Max70Text getCurrentStatusSubType() {
		return currentStatusSubType;
	}

	public void setCurrentStatusSubType(Max70Text currentStatusSubType) {
		this.currentStatusSubType = currentStatusSubType;
	}

	@XmlElement(name = "CurStsDtTm")
	public ISODateTime getCurrentStatusDateTime() {
		return currentStatusDateTime;
	}

	public void setCurrentStatusDateTime(ISODateTime currentStatusDateTime) {
		this.currentStatusDateTime = currentStatusDateTime;
	}

	@XmlElement(name = "PrvsSts")
	public Status6Choice getPreviousStatus() {
		return previousStatus;
	}

	public void setPreviousStatus(Status6Choice previousStatus) {
		this.previousStatus = previousStatus;
	}

	@XmlElement(name = "PrvsStsSubTp")
	public Max70Text getPreviousStatusSubType() {
		return previousStatusSubType;
	}

	public void setPreviousStatusSubType(Max70Text previousStatusSubType) {
		this.previousStatusSubType = previousStatusSubType;
	}

	@XmlElement(name = "PrvsStsDtTm")
	public ISODateTime getPreviousStatusDateTime() {
		return previousStatusDateTime;
	}

	public void setPreviousStatusDateTime(ISODateTime previousStatusDateTime) {
		this.previousStatusDateTime = previousStatusDateTime;
	}

	@XmlElement(name = "PdctTp")
	public Max35Text getProductType() {
		return productType;
	}

	public void setProductType(Max35Text productType) {
		this.productType = productType;
	}
}