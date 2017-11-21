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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RecordTechnicalData1", propOrder = {"receiptDateTime", "exchangeReason"})
public class RecordTechnicalData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime receiptDateTime;
	/**
	 * Defines the date and time when the report was originally received by the
	 * national competent authority.
	 * <p>
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
	public static final MMMessageAttribute mmReceiptDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RecordTechnicalData1.mmObject();
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
	};
	protected List<AuthorityExchangeReason1Code> exchangeReason;
	/**
	 * Describes the reason for the exchange of the transaction report between
	 * the competent authorities.
	 * <p>
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
	public static final MMMessageAttribute mmExchangeReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RecordTechnicalData1.mmObject();
			isDerived = false;
			xmlTag = "XchgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeReason";
			definition = "Describes the reason for the exchange of the transaction report between the competent authorities.";
			minOccurs = 1;
			simpleType_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RecordTechnicalData1.mmReceiptDateTime, RecordTechnicalData1.mmExchangeReason);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RecordTechnicalData1";
				definition = "Instrument specific technical data to support identification.";
				nextVersions_lazy = () -> Arrays.asList(RecordTechnicalData2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RctDtTm", required = true)
	public ISODateTime getReceiptDateTime() {
		return receiptDateTime;
	}

	public void setReceiptDateTime(ISODateTime receiptDateTime) {
		this.receiptDateTime = receiptDateTime;
	}

	@XmlElement(name = "XchgRsn", required = true)
	public List<AuthorityExchangeReason1Code> getExchangeReason() {
		return exchangeReason;
	}

	public void setExchangeReason(List<AuthorityExchangeReason1Code> exchangeReason) {
		this.exchangeReason = exchangeReason;
	}
}