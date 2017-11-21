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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.CorporateActionDeadline;
import com.tools20022.repository.entity.MeetingNotice;
import com.tools20022.repository.entity.SecuritiesBlockingDeadline;
import com.tools20022.repository.entity.SecuritiesRegistrationDeadline;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Dates determining the entitlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibilityDates#mmRecordDatexorSecuritiesRegistrationDate
 * EligibilityDates.mmRecordDatexorSecuritiesRegistrationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EligibilityDates#mmRecordDate
 * EligibilityDates.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibilityDates#mmSecuritiesRegistrationDate
 * EligibilityDates.mmSecuritiesRegistrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EligibilityDates#mmBlockingPeriod
 * EligibilityDates.mmBlockingPeriod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingNotice
 * MeetingNotice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EligibilityDates"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Dates determining the entitlement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "EligibilityDates", propOrder = {"recordDate", "securitiesRegistrationDate", "blockingPeriod"})
public class EligibilityDates {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate recordDate;
	/**
	 * Date at which the positions are struck to note which parties will receive
	 * the entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRecordDate
	 * CorporateActionDeadline.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates
	 * EligibilityDates}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the positions are struck to note which parties will receive the entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecordDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRecordDate;
			componentContext_lazy = () -> EligibilityDates.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date at which the positions are struck to note which parties will receive the entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate securitiesRegistrationDate;
	/**
	 * Date at which the voting positions are established (in some countries).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRegistrationDeadline#mmRegistrationDate
	 * SecuritiesRegistrationDeadline.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates
	 * EligibilityDates}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRegnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the voting positions are established (in some countries)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesRegistrationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesRegistrationDeadline.mmRegistrationDate;
			componentContext_lazy = () -> EligibilityDates.mmObject();
			isDerived = false;
			xmlTag = "SctiesRegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRegistrationDate";
			definition = "Date at which the voting positions are established (in some countries).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected DateTimePeriodDetails1 blockingPeriod;
	/**
	 * Period during which the securities are blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails1
	 * DateTimePeriodDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBlockingDeadline#mmBlockingPeriod
	 * SecuritiesBlockingDeadline.mmBlockingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates
	 * EligibilityDates}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the securities are blocked."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBlockingPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesBlockingDeadline.mmBlockingPeriod;
			componentContext_lazy = () -> EligibilityDates.mmObject();
			isDerived = false;
			xmlTag = "BlckgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockingPeriod";
			definition = "Period during which the securities are blocked.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateTimePeriodDetails1.mmObject();
		}
	};
	/**
	 * Either RecordDate or SecuritiesRegistrationDate may be present but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates
	 * EligibilityDates}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates#mmRecordDate
	 * EligibilityDates.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates#mmSecuritiesRegistrationDate
	 * EligibilityDates.mmSecuritiesRegistrationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDatexorSecuritiesRegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either RecordDate or SecuritiesRegistrationDate may be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmRecordDatexorSecuritiesRegistrationDate = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDatexorSecuritiesRegistrationDate";
			definition = "Either RecordDate or SecuritiesRegistrationDate may be present but not both.";
			messageComponent_lazy = () -> EligibilityDates.mmObject();
			impactedElements_lazy = () -> Arrays.asList(EligibilityDates.mmRecordDate, EligibilityDates.mmSecuritiesRegistrationDate);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(EligibilityDates.mmRecordDate, EligibilityDates.mmSecuritiesRegistrationDate, EligibilityDates.mmBlockingPeriod);
				trace_lazy = () -> MeetingNotice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EligibilityDates";
				definition = "Dates determining the entitlement.";
				xors_lazy = () -> Arrays.asList(EligibilityDates.mmRecordDatexorSecuritiesRegistrationDate);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RcrdDt")
	public ISODate getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(ISODate recordDate) {
		this.recordDate = recordDate;
	}

	@XmlElement(name = "SctiesRegnDt")
	public ISODate getSecuritiesRegistrationDate() {
		return securitiesRegistrationDate;
	}

	public void setSecuritiesRegistrationDate(ISODate securitiesRegistrationDate) {
		this.securitiesRegistrationDate = securitiesRegistrationDate;
	}

	@XmlElement(name = "BlckgPrd")
	public DateTimePeriodDetails1 getBlockingPeriod() {
		return blockingPeriod;
	}

	public void setBlockingPeriod(com.tools20022.repository.msg.DateTimePeriodDetails1 blockingPeriod) {
		this.blockingPeriod = blockingPeriod;
	}
}