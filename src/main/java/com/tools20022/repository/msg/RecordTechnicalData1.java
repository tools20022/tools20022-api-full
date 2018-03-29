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
import com.tools20022.repository.codeset.AuthorityExchangeReason1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Instrument specific technical data to support identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData1#mmReceiptDateTime
 * RecordTechnicalData1.mmReceiptDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData1#mmExchangeReason
 * RecordTechnicalData1.mmExchangeReason}</li>
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
 * "RecordTechnicalData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Instrument specific technical data to support identification."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RecordTechnicalData2
 * RecordTechnicalData2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RecordTechnicalData1", propOrder = {"receiptDateTime", "exchangeReason"})
public class RecordTechnicalData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RctDtTm", required = true)
	protected ISODateTime receiptDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData1
	 * RecordTechnicalData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RctDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiptDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date and time when the report was originally received by the national competent authority."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData2#mmReceiptDateTime
	 * RecordTechnicalData2.mmReceiptDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecordTechnicalData1, ISODateTime> mmReceiptDateTime = new MMMessageAttribute<RecordTechnicalData1, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData1.mmObject();
			isDerived = false;
			xmlTag = "RctDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiptDateTime";
			definition = "Defines the date and time when the report was originally received by the national competent authority.";
			nextVersions_lazy = () -> Arrays.asList(RecordTechnicalData2.mmReceiptDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(RecordTechnicalData1 obj) {
			return obj.getReceiptDateTime();
		}

		@Override
		public void setValue(RecordTechnicalData1 obj, ISODateTime value) {
			obj.setReceiptDateTime(value);
		}
	};
	@XmlElement(name = "XchgRsn", required = true)
	protected List<AuthorityExchangeReason1Code> exchangeReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData1
	 * RecordTechnicalData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the reason for the exchange of the transaction report between the competent authorities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecordTechnicalData1, List<AuthorityExchangeReason1Code>> mmExchangeReason = new MMMessageAttribute<RecordTechnicalData1, List<AuthorityExchangeReason1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData1.mmObject();
			isDerived = false;
			xmlTag = "XchgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeReason";
			definition = "Describes the reason for the exchange of the transaction report between the competent authorities.";
			minOccurs = 1;
			simpleType_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}

		@Override
		public List<AuthorityExchangeReason1Code> getValue(RecordTechnicalData1 obj) {
			return obj.getExchangeReason();
		}

		@Override
		public void setValue(RecordTechnicalData1 obj, List<AuthorityExchangeReason1Code> value) {
			obj.setExchangeReason(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecordTechnicalData1.mmReceiptDateTime, com.tools20022.repository.msg.RecordTechnicalData1.mmExchangeReason);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RecordTechnicalData1";
				definition = "Instrument specific technical data to support identification.";
				nextVersions_lazy = () -> Arrays.asList(RecordTechnicalData2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getReceiptDateTime() {
		return receiptDateTime;
	}

	public RecordTechnicalData1 setReceiptDateTime(ISODateTime receiptDateTime) {
		this.receiptDateTime = Objects.requireNonNull(receiptDateTime);
		return this;
	}

	public List<AuthorityExchangeReason1Code> getExchangeReason() {
		return exchangeReason == null ? exchangeReason = new ArrayList<>() : exchangeReason;
	}

	public RecordTechnicalData1 setExchangeReason(List<AuthorityExchangeReason1Code> exchangeReason) {
		this.exchangeReason = Objects.requireNonNull(exchangeReason);
		return this;
	}
}