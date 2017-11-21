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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.area.trea.StatusNotificationV02;
import com.tools20022.repository.codeset.TradeStatus1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.StatusOriginator;
import com.tools20022.repository.entity.TreasuryTradeSettlementStatus;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information on the status of a trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData1#mmCurrentStatusOrExtendedCurrentStatusRule
 * TradeData1.mmCurrentStatusOrExtendedCurrentStatusRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData1#mmPreviousStatusOrExtendedPreviousStatusRule
 * TradeData1.mmPreviousStatusOrExtendedPreviousStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData1#mmNotificationIdentification
 * TradeData1.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData1#mmMatchingSystemUniqueReference
 * TradeData1.mmMatchingSystemUniqueReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData1#mmStatusOriginator
 * TradeData1.mmStatusOriginator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData1#mmCurrentStatus
 * TradeData1.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData1#mmExtendedCurrentStatus
 * TradeData1.mmExtendedCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData1#mmCurrentStatusSubType
 * TradeData1.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData1#mmCurrentStatusTime
 * TradeData1.mmCurrentStatusTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData1#mmPreviousStatus
 * TradeData1.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData1#mmExtendedPreviousStatus
 * TradeData1.mmExtendedPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData1#mmPreviousStatusSubType
 * TradeData1.mmPreviousStatusSubType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData1#mmPreviousStatusTime
 * TradeData1.mmPreviousStatusTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData1#mmProductType
 * TradeData1.mmProductType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
 * TreasuryTradeSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.StatusNotificationV02#mmTradeData
 * StatusNotificationV02.mmTradeData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information on the status of a trade."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TradeData1", propOrder = {"notificationIdentification", "matchingSystemUniqueReference", "statusOriginator", "currentStatus", "extendedCurrentStatus", "currentStatusSubType", "currentStatusTime", "previousStatus",
		"extendedPreviousStatus", "previousStatusSubType", "previousStatusTime", "productType"})
public class TradeData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text notificationIdentification;
	/**
	 * Refers to the identification of a notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
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
	 * definition} = "Refers to the identification of a notification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotificationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeData1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationIdentification";
			definition = "Refers to the identification of a notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text matchingSystemUniqueReference;
	/**
	 * Reference to the unique identification assigned to a trade by a central
	 * matching system.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
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
	 * "Reference to the unique identification assigned to a trade by a central matching system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingSystemUniqueReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> TradeData1.mmObject();
			isDerived = false;
			xmlTag = "MtchgSysUnqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingSystemUniqueReference";
			definition = "Reference to the unique identification assigned to a trade by a central matching system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text statusOriginator;
	/**
	 * Identifies the party which assigned a status to a treasury trade.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
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
	 * "Identifies the party which assigned a status to a treasury trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusOriginator = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> StatusOriginator.mmObject();
			componentContext_lazy = () -> TradeData1.mmObject();
			isDerived = false;
			xmlTag = "StsOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOriginator";
			definition = "Identifies the party which assigned a status to a treasury trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected TradeStatus1Code currentStatus;
	/**
	 * Specifies the new status of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus1Code
	 * TradeStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTradeStatus
	 * TreasuryTradeSettlementStatus.mmTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
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
			componentContext_lazy = () -> TradeData1.mmObject();
			isDerived = false;
			xmlTag = "CurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatus";
			definition = "Specifies the new status of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeStatus1Code.mmObject();
		}
	};
	protected Extended350Code extendedCurrentStatus;
	/**
	 * Description of the status of a trade when no coded form is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTradeStatus
	 * TreasuryTradeSettlementStatus.mmTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedCurSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedCurrentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the status of a trade when no coded form is available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedCurrentStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> TradeData1.mmObject();
			isDerived = false;
			xmlTag = "XtndedCurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedCurrentStatus";
			definition = "Description of the status of a trade when no coded form is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
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
			componentContext_lazy = () -> TradeData1.mmObject();
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
	protected ISODateTime currentStatusTime;
	/**
	 * Specifies the time at which the current status was assigned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurStsTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatusTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the time at which the current status was assigned."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatusTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> TradeData1.mmObject();
			isDerived = false;
			xmlTag = "CurStsTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusTime";
			definition = "Specifies the time at which the current status was assigned.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected TradeStatus1Code previousStatus;
	/**
	 * Specifies the previous status of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus1Code
	 * TradeStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTradeStatus
	 * TreasuryTradeSettlementStatus.mmTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
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
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> TradeData1.mmObject();
			isDerived = false;
			xmlTag = "PrvsSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatus";
			definition = "Specifies the previous status of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradeStatus1Code.mmObject();
		}
	};
	protected Extended350Code extendedPreviousStatus;
	/**
	 * Description of the status of a trade when no coded form is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTradeStatus
	 * TreasuryTradeSettlementStatus.mmTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedPrvsSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedPreviousStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the status of a trade when no coded form is available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedPreviousStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> TradeData1.mmObject();
			isDerived = false;
			xmlTag = "XtndedPrvsSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedPreviousStatus";
			definition = "Description of the status of a trade when no coded form is available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTradeStatus
	 * TreasuryTradeSettlementStatus.mmTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
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
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> TradeData1.mmObject();
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
	protected ISODateTime previousStatusTime;
	/**
	 * Specifies the time at which the previous status was assigned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsStsTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousStatusTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the time at which the previous status was assigned."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousStatusTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> TradeData1.mmObject();
			isDerived = false;
			xmlTag = "PrvsStsTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusTime";
			definition = "Specifies the time at which the previous status was assigned.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max4AlphaNumericText productType;
	/**
	 * Specifies the product for which the status of the confirmation is
	 * reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
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
			componentContext_lazy = () -> TradeData1.mmObject();
			isDerived = false;
			xmlTag = "PdctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductType";
			definition = "Specifies the product for which the status of the confirmation is reported.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData1#mmCurrentStatus
	 * TradeData1.mmCurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmExtendedCurrentStatus
	 * TradeData1.mmExtendedCurrentStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatusOrExtendedCurrentStatusRule"</li>
	 * </ul>
	 */
	public static final MMXor mmCurrentStatusOrExtendedCurrentStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusOrExtendedCurrentStatusRule";
			messageComponent_lazy = () -> TradeData1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(TradeData1.mmCurrentStatus, TradeData1.mmExtendedCurrentStatus);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.TradeData1
	 * TradeData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmPreviousStatus
	 * TradeData1.mmPreviousStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmExtendedPreviousStatus
	 * TradeData1.mmExtendedPreviousStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousStatusOrExtendedPreviousStatusRule"</li>
	 * </ul>
	 */
	public static final MMXor mmPreviousStatusOrExtendedPreviousStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusOrExtendedPreviousStatusRule";
			messageComponent_lazy = () -> TradeData1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(TradeData1.mmPreviousStatus, TradeData1.mmExtendedPreviousStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TradeData1.mmNotificationIdentification, TradeData1.mmMatchingSystemUniqueReference, TradeData1.mmStatusOriginator, TradeData1.mmCurrentStatus, TradeData1.mmExtendedCurrentStatus,
						TradeData1.mmCurrentStatusSubType, TradeData1.mmCurrentStatusTime, TradeData1.mmPreviousStatus, TradeData1.mmExtendedPreviousStatus, TradeData1.mmPreviousStatusSubType, TradeData1.mmPreviousStatusTime,
						TradeData1.mmProductType);
				messageBuildingBlock_lazy = () -> Arrays.asList(StatusNotificationV02.mmTradeData);
				trace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TradeData1";
				definition = "Provides information on the status of a trade.";
				xors_lazy = () -> Arrays.asList(TradeData1.mmCurrentStatusOrExtendedCurrentStatusRule, TradeData1.mmPreviousStatusOrExtendedPreviousStatusRule);
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

	@XmlElement(name = "StsOrgtr")
	public Max35Text getStatusOriginator() {
		return statusOriginator;
	}

	public void setStatusOriginator(Max35Text statusOriginator) {
		this.statusOriginator = statusOriginator;
	}

	@XmlElement(name = "CurSts", required = true)
	public TradeStatus1Code getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(TradeStatus1Code currentStatus) {
		this.currentStatus = currentStatus;
	}

	@XmlElement(name = "XtndedCurSts", required = true)
	public Extended350Code getExtendedCurrentStatus() {
		return extendedCurrentStatus;
	}

	public void setExtendedCurrentStatus(Extended350Code extendedCurrentStatus) {
		this.extendedCurrentStatus = extendedCurrentStatus;
	}

	@XmlElement(name = "CurStsSubTp")
	public Max70Text getCurrentStatusSubType() {
		return currentStatusSubType;
	}

	public void setCurrentStatusSubType(Max70Text currentStatusSubType) {
		this.currentStatusSubType = currentStatusSubType;
	}

	@XmlElement(name = "CurStsTm")
	public ISODateTime getCurrentStatusTime() {
		return currentStatusTime;
	}

	public void setCurrentStatusTime(ISODateTime currentStatusTime) {
		this.currentStatusTime = currentStatusTime;
	}

	@XmlElement(name = "PrvsSts")
	public TradeStatus1Code getPreviousStatus() {
		return previousStatus;
	}

	public void setPreviousStatus(TradeStatus1Code previousStatus) {
		this.previousStatus = previousStatus;
	}

	@XmlElement(name = "XtndedPrvsSts")
	public Extended350Code getExtendedPreviousStatus() {
		return extendedPreviousStatus;
	}

	public void setExtendedPreviousStatus(Extended350Code extendedPreviousStatus) {
		this.extendedPreviousStatus = extendedPreviousStatus;
	}

	@XmlElement(name = "PrvsStsSubTp")
	public Max70Text getPreviousStatusSubType() {
		return previousStatusSubType;
	}

	public void setPreviousStatusSubType(Max70Text previousStatusSubType) {
		this.previousStatusSubType = previousStatusSubType;
	}

	@XmlElement(name = "PrvsStsTm")
	public ISODateTime getPreviousStatusTime() {
		return previousStatusTime;
	}

	public void setPreviousStatusTime(ISODateTime previousStatusTime) {
		this.previousStatusTime = previousStatusTime;
	}

	@XmlElement(name = "PdctTp")
	public Max4AlphaNumericText getProductType() {
		return productType;
	}

	public void setProductType(Max4AlphaNumericText productType) {
		this.productType = productType;
	}
}