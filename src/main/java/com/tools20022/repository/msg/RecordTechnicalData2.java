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
import com.tools20022.repository.codeset.CancelledStatusReason15Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData2#mmReceiptDateTime
 * RecordTechnicalData2.mmReceiptDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData2#mmCancellationReason
 * RecordTechnicalData2.mmCancellationReason}</li>
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
 * "RecordTechnicalData2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Instrument specific technical data to support identification."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RecordTechnicalData3
 * RecordTechnicalData3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData1
 * RecordTechnicalData1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RecordTechnicalData2", propOrder = {"receiptDateTime", "cancellationReason"})
public class RecordTechnicalData2 {

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
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData2
	 * RecordTechnicalData2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData1#mmReceiptDateTime
	 * RecordTechnicalData1.mmReceiptDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecordTechnicalData2, ISODateTime> mmReceiptDateTime = new MMMessageAttribute<RecordTechnicalData2, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData2.mmObject();
			isDerived = false;
			xmlTag = "RctDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiptDateTime";
			definition = "Defines the date and time when the report was originally received by the national competent authority.";
			previousVersion_lazy = () -> RecordTechnicalData1.mmReceiptDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(RecordTechnicalData2 obj) {
			return obj.getReceiptDateTime();
		}

		@Override
		public void setValue(RecordTechnicalData2 obj, ISODateTime value) {
			obj.setReceiptDateTime(value);
		}
	};
	@XmlElement(name = "CxlRsn", required = true)
	protected CancelledStatusReason15Code cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason15Code
	 * CancelledStatusReason15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData2
	 * RecordTechnicalData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for the cancellation the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecordTechnicalData2, CancelledStatusReason15Code> mmCancellationReason = new MMMessageAttribute<RecordTechnicalData2, CancelledStatusReason15Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData2.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason for the cancellation the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancelledStatusReason15Code.mmObject();
		}

		@Override
		public CancelledStatusReason15Code getValue(RecordTechnicalData2 obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(RecordTechnicalData2 obj, CancelledStatusReason15Code value) {
			obj.setCancellationReason(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecordTechnicalData2.mmReceiptDateTime, com.tools20022.repository.msg.RecordTechnicalData2.mmCancellationReason);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RecordTechnicalData2";
				definition = "Instrument specific technical data to support identification.";
				nextVersions_lazy = () -> Arrays.asList(RecordTechnicalData3.mmObject());
				previousVersion_lazy = () -> RecordTechnicalData1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getReceiptDateTime() {
		return receiptDateTime;
	}

	public RecordTechnicalData2 setReceiptDateTime(ISODateTime receiptDateTime) {
		this.receiptDateTime = Objects.requireNonNull(receiptDateTime);
		return this;
	}

	public CancelledStatusReason15Code getCancellationReason() {
		return cancellationReason;
	}

	public RecordTechnicalData2 setCancellationReason(CancelledStatusReason15Code cancellationReason) {
		this.cancellationReason = Objects.requireNonNull(cancellationReason);
		return this;
	}
}