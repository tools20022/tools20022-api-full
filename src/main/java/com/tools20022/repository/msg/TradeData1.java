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
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.TradeData1#CurrentStatusOrExtendedCurrentStatusRule
 * TradeData1.CurrentStatusOrExtendedCurrentStatusRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData1#PreviousStatusOrExtendedPreviousStatusRule
 * TradeData1.PreviousStatusOrExtendedPreviousStatusRule}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeData1", propOrder = {"notificationIdentification", "matchingSystemUniqueReference", "statusOriginator", "currentStatus", "extendedCurrentStatus", "currentStatusSubType", "currentStatusTime", "previousStatus",
		"extendedPreviousStatus", "previousStatusSubType", "previousStatusTime", "productType"})
public class TradeData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtfctnId", required = true)
	protected Max35Text notificationIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, Max35Text> mmNotificationIdentification = new MMMessageAttribute<TradeData1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationIdentification";
			definition = "Refers to the identification of a notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeData1 obj) {
			return obj.getNotificationIdentification();
		}

		@Override
		public void setValue(TradeData1 obj, Max35Text value) {
			obj.setNotificationIdentification(value);
		}
	};
	@XmlElement(name = "MtchgSysUnqRef", required = true)
	protected Max35Text matchingSystemUniqueReference;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, Max35Text> mmMatchingSystemUniqueReference = new MMMessageAttribute<TradeData1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "MtchgSysUnqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingSystemUniqueReference";
			definition = "Reference to the unique identification assigned to a trade by a central matching system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeData1 obj) {
			return obj.getMatchingSystemUniqueReference();
		}

		@Override
		public void setValue(TradeData1 obj, Max35Text value) {
			obj.setMatchingSystemUniqueReference(value);
		}
	};
	@XmlElement(name = "StsOrgtr")
	protected Max35Text statusOriginator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, Optional<Max35Text>> mmStatusOriginator = new MMMessageAttribute<TradeData1, Optional<Max35Text>>() {
		{
			businessComponentTrace_lazy = () -> StatusOriginator.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "StsOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOriginator";
			definition = "Identifies the party which assigned a status to a treasury trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeData1 obj) {
			return obj.getStatusOriginator();
		}

		@Override
		public void setValue(TradeData1 obj, Optional<Max35Text> value) {
			obj.setStatusOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "CurSts", required = true)
	protected TradeStatus1Code currentStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, TradeStatus1Code> mmCurrentStatus = new MMMessageAttribute<TradeData1, TradeStatus1Code>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "CurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatus";
			definition = "Specifies the new status of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeStatus1Code.mmObject();
		}

		@Override
		public TradeStatus1Code getValue(TradeData1 obj) {
			return obj.getCurrentStatus();
		}

		@Override
		public void setValue(TradeData1 obj, TradeStatus1Code value) {
			obj.setCurrentStatus(value);
		}
	};
	@XmlElement(name = "XtndedCurSts", required = true)
	protected Extended350Code extendedCurrentStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, Extended350Code> mmExtendedCurrentStatus = new MMMessageAttribute<TradeData1, Extended350Code>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "XtndedCurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedCurrentStatus";
			definition = "Description of the status of a trade when no coded form is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(TradeData1 obj) {
			return obj.getExtendedCurrentStatus();
		}

		@Override
		public void setValue(TradeData1 obj, Extended350Code value) {
			obj.setExtendedCurrentStatus(value);
		}
	};
	@XmlElement(name = "CurStsSubTp")
	protected Max70Text currentStatusSubType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, Optional<Max70Text>> mmCurrentStatusSubType = new MMMessageAttribute<TradeData1, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "CurStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusSubType";
			definition = "Additional information on the current status of a trade in a central system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(TradeData1 obj) {
			return obj.getCurrentStatusSubType();
		}

		@Override
		public void setValue(TradeData1 obj, Optional<Max70Text> value) {
			obj.setCurrentStatusSubType(value.orElse(null));
		}
	};
	@XmlElement(name = "CurStsTm")
	protected ISODateTime currentStatusTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, Optional<ISODateTime>> mmCurrentStatusTime = new MMMessageAttribute<TradeData1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "CurStsTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusTime";
			definition = "Specifies the time at which the current status was assigned.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(TradeData1 obj) {
			return obj.getCurrentStatusTime();
		}

		@Override
		public void setValue(TradeData1 obj, Optional<ISODateTime> value) {
			obj.setCurrentStatusTime(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsSts")
	protected TradeStatus1Code previousStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, Optional<TradeStatus1Code>> mmPreviousStatus = new MMMessageAttribute<TradeData1, Optional<TradeStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "PrvsSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatus";
			definition = "Specifies the previous status of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradeStatus1Code.mmObject();
		}

		@Override
		public Optional<TradeStatus1Code> getValue(TradeData1 obj) {
			return obj.getPreviousStatus();
		}

		@Override
		public void setValue(TradeData1 obj, Optional<TradeStatus1Code> value) {
			obj.setPreviousStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "XtndedPrvsSts")
	protected Extended350Code extendedPreviousStatus;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, Optional<Extended350Code>> mmExtendedPreviousStatus = new MMMessageAttribute<TradeData1, Optional<Extended350Code>>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "XtndedPrvsSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedPreviousStatus";
			definition = "Description of the status of a trade when no coded form is available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Optional<Extended350Code> getValue(TradeData1 obj) {
			return obj.getExtendedPreviousStatus();
		}

		@Override
		public void setValue(TradeData1 obj, Optional<Extended350Code> value) {
			obj.setExtendedPreviousStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsStsSubTp")
	protected Max70Text previousStatusSubType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, Optional<Max70Text>> mmPreviousStatusSubType = new MMMessageAttribute<TradeData1, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "PrvsStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusSubType";
			definition = "Additional information on the previous status of a trade in a central system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(TradeData1 obj) {
			return obj.getPreviousStatusSubType();
		}

		@Override
		public void setValue(TradeData1 obj, Optional<Max70Text> value) {
			obj.setPreviousStatusSubType(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsStsTm")
	protected ISODateTime previousStatusTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, Optional<ISODateTime>> mmPreviousStatusTime = new MMMessageAttribute<TradeData1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "PrvsStsTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusTime";
			definition = "Specifies the time at which the previous status was assigned.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(TradeData1 obj) {
			return obj.getPreviousStatusTime();
		}

		@Override
		public void setValue(TradeData1 obj, Optional<ISODateTime> value) {
			obj.setPreviousStatusTime(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctTp")
	protected Max4AlphaNumericText productType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TradeData1, Optional<Max4AlphaNumericText>> mmProductType = new MMMessageAttribute<TradeData1, Optional<Max4AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			isDerived = false;
			xmlTag = "PdctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductType";
			definition = "Specifies the product for which the status of the confirmation is reported.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Max4AlphaNumericText> getValue(TradeData1 obj) {
			return obj.getProductType();
		}

		@Override
		public void setValue(TradeData1 obj, Optional<Max4AlphaNumericText> value) {
			obj.setProductType(value.orElse(null));
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
	public static final MMXor CurrentStatusOrExtendedCurrentStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatusOrExtendedCurrentStatusRule";
			messageComponent_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData1.mmCurrentStatus, com.tools20022.repository.msg.TradeData1.mmExtendedCurrentStatus);
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
	public static final MMXor PreviousStatusOrExtendedPreviousStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousStatusOrExtendedPreviousStatusRule";
			messageComponent_lazy = () -> com.tools20022.repository.msg.TradeData1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData1.mmPreviousStatus, com.tools20022.repository.msg.TradeData1.mmExtendedPreviousStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData1.mmNotificationIdentification, com.tools20022.repository.msg.TradeData1.mmMatchingSystemUniqueReference,
						com.tools20022.repository.msg.TradeData1.mmStatusOriginator, com.tools20022.repository.msg.TradeData1.mmCurrentStatus, com.tools20022.repository.msg.TradeData1.mmExtendedCurrentStatus,
						com.tools20022.repository.msg.TradeData1.mmCurrentStatusSubType, com.tools20022.repository.msg.TradeData1.mmCurrentStatusTime, com.tools20022.repository.msg.TradeData1.mmPreviousStatus,
						com.tools20022.repository.msg.TradeData1.mmExtendedPreviousStatus, com.tools20022.repository.msg.TradeData1.mmPreviousStatusSubType, com.tools20022.repository.msg.TradeData1.mmPreviousStatusTime,
						com.tools20022.repository.msg.TradeData1.mmProductType);
				messageBuildingBlock_lazy = () -> Arrays.asList(StatusNotificationV02.mmTradeData);
				trace_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
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
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeData1.CurrentStatusOrExtendedCurrentStatusRule, com.tools20022.repository.msg.TradeData1.PreviousStatusOrExtendedPreviousStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getNotificationIdentification() {
		return notificationIdentification;
	}

	public TradeData1 setNotificationIdentification(Max35Text notificationIdentification) {
		this.notificationIdentification = Objects.requireNonNull(notificationIdentification);
		return this;
	}

	public Max35Text getMatchingSystemUniqueReference() {
		return matchingSystemUniqueReference;
	}

	public TradeData1 setMatchingSystemUniqueReference(Max35Text matchingSystemUniqueReference) {
		this.matchingSystemUniqueReference = Objects.requireNonNull(matchingSystemUniqueReference);
		return this;
	}

	public Optional<Max35Text> getStatusOriginator() {
		return statusOriginator == null ? Optional.empty() : Optional.of(statusOriginator);
	}

	public TradeData1 setStatusOriginator(Max35Text statusOriginator) {
		this.statusOriginator = statusOriginator;
		return this;
	}

	public TradeStatus1Code getCurrentStatus() {
		return currentStatus;
	}

	public TradeData1 setCurrentStatus(TradeStatus1Code currentStatus) {
		this.currentStatus = Objects.requireNonNull(currentStatus);
		return this;
	}

	public Extended350Code getExtendedCurrentStatus() {
		return extendedCurrentStatus;
	}

	public TradeData1 setExtendedCurrentStatus(Extended350Code extendedCurrentStatus) {
		this.extendedCurrentStatus = Objects.requireNonNull(extendedCurrentStatus);
		return this;
	}

	public Optional<Max70Text> getCurrentStatusSubType() {
		return currentStatusSubType == null ? Optional.empty() : Optional.of(currentStatusSubType);
	}

	public TradeData1 setCurrentStatusSubType(Max70Text currentStatusSubType) {
		this.currentStatusSubType = currentStatusSubType;
		return this;
	}

	public Optional<ISODateTime> getCurrentStatusTime() {
		return currentStatusTime == null ? Optional.empty() : Optional.of(currentStatusTime);
	}

	public TradeData1 setCurrentStatusTime(ISODateTime currentStatusTime) {
		this.currentStatusTime = currentStatusTime;
		return this;
	}

	public Optional<TradeStatus1Code> getPreviousStatus() {
		return previousStatus == null ? Optional.empty() : Optional.of(previousStatus);
	}

	public TradeData1 setPreviousStatus(TradeStatus1Code previousStatus) {
		this.previousStatus = previousStatus;
		return this;
	}

	public Optional<Extended350Code> getExtendedPreviousStatus() {
		return extendedPreviousStatus == null ? Optional.empty() : Optional.of(extendedPreviousStatus);
	}

	public TradeData1 setExtendedPreviousStatus(Extended350Code extendedPreviousStatus) {
		this.extendedPreviousStatus = extendedPreviousStatus;
		return this;
	}

	public Optional<Max70Text> getPreviousStatusSubType() {
		return previousStatusSubType == null ? Optional.empty() : Optional.of(previousStatusSubType);
	}

	public TradeData1 setPreviousStatusSubType(Max70Text previousStatusSubType) {
		this.previousStatusSubType = previousStatusSubType;
		return this;
	}

	public Optional<ISODateTime> getPreviousStatusTime() {
		return previousStatusTime == null ? Optional.empty() : Optional.of(previousStatusTime);
	}

	public TradeData1 setPreviousStatusTime(ISODateTime previousStatusTime) {
		this.previousStatusTime = previousStatusTime;
		return this;
	}

	public Optional<Max4AlphaNumericText> getProductType() {
		return productType == null ? Optional.empty() : Optional.of(productType);
	}

	public TradeData1 setProductType(Max4AlphaNumericText productType) {
		this.productType = productType;
		return this;
	}
}