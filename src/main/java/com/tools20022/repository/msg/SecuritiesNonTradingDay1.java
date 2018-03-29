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
import com.tools20022.repository.codeset.NonTradingDayReason1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details the date and reason for a non working day.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesNonTradingDay1#mmTechnicalRecordIdentification
 * SecuritiesNonTradingDay1.mmTechnicalRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesNonTradingDay1#mmDate
 * SecuritiesNonTradingDay1.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesNonTradingDay1#mmReason
 * SecuritiesNonTradingDay1.mmReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesNonTradingDay1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details the date and reason for a non working day."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesNonTradingDay1", propOrder = {"technicalRecordIdentification", "date", "reason"})
public class SecuritiesNonTradingDay1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TechRcrdId")
	protected Max35Text technicalRecordIdentification;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesNonTradingDay1
	 * SecuritiesNonTradingDay1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechRcrdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalRecordIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of a record in a message used as part of error management and status advice messages.\r\n\r\nUsage:\r\nThis identification will be used in the status advice report sent back."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesNonTradingDay1, Optional<Max35Text>> mmTechnicalRecordIdentification = new MMMessageAttribute<SecuritiesNonTradingDay1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesNonTradingDay1.mmObject();
			isDerived = false;
			xmlTag = "TechRcrdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalRecordIdentification";
			definition = "Unique identifier of a record in a message used as part of error management and status advice messages.\r\n\r\nUsage:\r\nThis identification will be used in the status advice report sent back.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecuritiesNonTradingDay1 obj) {
			return obj.getTechnicalRecordIdentification();
		}

		@Override
		public void setValue(SecuritiesNonTradingDay1 obj, Optional<Max35Text> value) {
			obj.setTechnicalRecordIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Dt", required = true)
	protected ISODate date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesNonTradingDay1
	 * SecuritiesNonTradingDay1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non-working date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesNonTradingDay1, ISODate> mmDate = new MMMessageAttribute<SecuritiesNonTradingDay1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesNonTradingDay1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Non-working date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(SecuritiesNonTradingDay1 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(SecuritiesNonTradingDay1 obj, ISODate value) {
			obj.setDate(value);
		}
	};
	@XmlElement(name = "Rsn")
	protected NonTradingDayReason1Code reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NonTradingDayReason1Code
	 * NonTradingDayReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesNonTradingDay1
	 * SecuritiesNonTradingDay1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason code for the non-working day."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesNonTradingDay1, Optional<NonTradingDayReason1Code>> mmReason = new MMMessageAttribute<SecuritiesNonTradingDay1, Optional<NonTradingDayReason1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesNonTradingDay1.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason code for the non-working day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NonTradingDayReason1Code.mmObject();
		}

		@Override
		public Optional<NonTradingDayReason1Code> getValue(SecuritiesNonTradingDay1 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(SecuritiesNonTradingDay1 obj, Optional<NonTradingDayReason1Code> value) {
			obj.setReason(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesNonTradingDay1.mmTechnicalRecordIdentification, com.tools20022.repository.msg.SecuritiesNonTradingDay1.mmDate,
						com.tools20022.repository.msg.SecuritiesNonTradingDay1.mmReason);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesNonTradingDay1";
				definition = "Details the date and reason for a non working day.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTechnicalRecordIdentification() {
		return technicalRecordIdentification == null ? Optional.empty() : Optional.of(technicalRecordIdentification);
	}

	public SecuritiesNonTradingDay1 setTechnicalRecordIdentification(Max35Text technicalRecordIdentification) {
		this.technicalRecordIdentification = technicalRecordIdentification;
		return this;
	}

	public ISODate getDate() {
		return date;
	}

	public SecuritiesNonTradingDay1 setDate(ISODate date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public Optional<NonTradingDayReason1Code> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public SecuritiesNonTradingDay1 setReason(NonTradingDayReason1Code reason) {
		this.reason = reason;
		return this;
	}
}