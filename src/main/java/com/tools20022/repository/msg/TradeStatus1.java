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
import com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02;
import com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02;
import com.tools20022.repository.codeset.TradeStatus1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.TradeIdentification;
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
 * Specifies the status of a trade in a central settlement system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeStatus1#mmStatusOrExtendedStatusRule
 * TradeStatus1.mmStatusOrExtendedStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#mmAllegedTrade
 * TradeStatus1.mmAllegedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeStatus1#mmMatchingSystemUniqueReference
 * TradeStatus1.mmMatchingSystemUniqueReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#mmStatus
 * TradeStatus1.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#mmExtendedStatus
 * TradeStatus1.mmExtendedStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#mmStatusSubType
 * TradeStatus1.mmStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#mmStatusTime
 * TradeStatus1.mmStatusTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeStatus1#mmStatusOriginator
 * TradeStatus1.mmStatusOriginator}</li>
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
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02#mmTradeInformationAndStatus
 * NonDeliverableForwardNotificationV02.mmTradeInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02#mmTradeStatus
 * ForeignExchangeOptionNotificationV02.mmTradeStatus}</li>
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
 * "TradeStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a trade in a central settlement system."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TradeStatus1", propOrder = {"allegedTrade", "matchingSystemUniqueReference", "status", "extendedStatus", "statusSubType", "statusTime", "statusOriginator"})
public class TradeStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator allegedTrade;
	/**
	 * Specifies whether a trade is alleged or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmAllegedTrade
	 * TreasuryTradeSettlementStatus.mmAllegedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1 TradeStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllgdTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether a trade is alleged or not."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllegedTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmAllegedTrade;
			componentContext_lazy = () -> TradeStatus1.mmObject();
			isDerived = false;
			xmlTag = "AllgdTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegedTrade";
			definition = "Specifies whether a trade is alleged or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmMatchingReference
	 * TradeIdentification.mmMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1 TradeStatus1}</li>
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
			businessElementTrace_lazy = () -> TradeIdentification.mmMatchingReference;
			componentContext_lazy = () -> TradeStatus1.mmObject();
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
	protected TradeStatus1Code status;
	/**
	 * Specifies the status of a trade
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1 TradeStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a trade"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> TradeStatus1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Specifies the status of a trade";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradeStatus1Code.mmObject();
		}
	};
	protected Extended350Code extendedStatus;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1 TradeStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the status of a trade when no coded form is available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> TradeStatus1.mmObject();
			isDerived = false;
			xmlTag = "XtndedSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedStatus";
			definition = "Description of the status of a trade when no coded form is available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	protected Max70Text statusSubType;
	/**
	 * Additional information on the status of a trade in a central system.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1 TradeStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsSubTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusSubType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information on the status of a trade in a central system."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusSubType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmTradeStatus;
			componentContext_lazy = () -> TradeStatus1.mmObject();
			isDerived = false;
			xmlTag = "StsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusSubType";
			definition = "Additional information on the status of a trade in a central system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected ISODateTime statusTime;
	/**
	 * Specifies the time at which a status was assigned.
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1 TradeStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the time at which a status was assigned."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> TradeStatus1.mmObject();
			isDerived = false;
			xmlTag = "StsTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusTime";
			definition = "Specifies the time at which a status was assigned.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1 TradeStatus1}</li>
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
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> TradeStatus1.mmObject();
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
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1 TradeStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#mmStatus
	 * TradeStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1#mmExtendedStatus
	 * TradeStatus1.mmExtendedStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOrExtendedStatusRule"</li>
	 * </ul>
	 */
	public static final MMXor mmStatusOrExtendedStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOrExtendedStatusRule";
			messageComponent_lazy = () -> TradeStatus1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(TradeStatus1.mmStatus, TradeStatus1.mmExtendedStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TradeStatus1.mmAllegedTrade, TradeStatus1.mmMatchingSystemUniqueReference, TradeStatus1.mmStatus, TradeStatus1.mmExtendedStatus, TradeStatus1.mmStatusSubType,
						TradeStatus1.mmStatusTime, TradeStatus1.mmStatusOriginator);
				messageBuildingBlock_lazy = () -> Arrays.asList(NonDeliverableForwardNotificationV02.mmTradeInformationAndStatus, ForeignExchangeOptionNotificationV02.mmTradeStatus);
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
				name = "TradeStatus1";
				definition = "Specifies the status of a trade in a central settlement system.";
				xors_lazy = () -> Arrays.asList(TradeStatus1.mmStatusOrExtendedStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AllgdTrad")
	public YesNoIndicator getAllegedTrade() {
		return allegedTrade;
	}

	public void setAllegedTrade(YesNoIndicator allegedTrade) {
		this.allegedTrade = allegedTrade;
	}

	@XmlElement(name = "MtchgSysUnqRef", required = true)
	public Max35Text getMatchingSystemUniqueReference() {
		return matchingSystemUniqueReference;
	}

	public void setMatchingSystemUniqueReference(Max35Text matchingSystemUniqueReference) {
		this.matchingSystemUniqueReference = matchingSystemUniqueReference;
	}

	@XmlElement(name = "Sts")
	public TradeStatus1Code getStatus() {
		return status;
	}

	public void setStatus(TradeStatus1Code status) {
		this.status = status;
	}

	@XmlElement(name = "XtndedSts")
	public Extended350Code getExtendedStatus() {
		return extendedStatus;
	}

	public void setExtendedStatus(Extended350Code extendedStatus) {
		this.extendedStatus = extendedStatus;
	}

	@XmlElement(name = "StsSubTp")
	public Max70Text getStatusSubType() {
		return statusSubType;
	}

	public void setStatusSubType(Max70Text statusSubType) {
		this.statusSubType = statusSubType;
	}

	@XmlElement(name = "StsTm")
	public ISODateTime getStatusTime() {
		return statusTime;
	}

	public void setStatusTime(ISODateTime statusTime) {
		this.statusTime = statusTime;
	}

	@XmlElement(name = "StsOrgtr")
	public Max35Text getStatusOriginator() {
		return statusOriginator;
	}

	public void setStatusOriginator(Max35Text statusOriginator) {
		this.statusOriginator = statusOriginator;
	}
}