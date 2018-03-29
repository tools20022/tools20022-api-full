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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information on the rejection reason of an individual element.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectedElement1#mmElementSequenceNumber
 * RejectedElement1.mmElementSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectedElement1#mmIndividualRejectionReason
 * RejectedElement1.mmIndividualRejectionReason}</li>
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
 * "RejectedElement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information on the rejection reason of an individual element."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RejectedElement1", propOrder = {"elementSequenceNumber", "individualRejectionReason"})
public class RejectedElement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ElmtSeqNb", required = true)
	protected Number elementSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectedElement1
	 * RejectedElement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElmtSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElementSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence number that allows to easily identify the element that is rejected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RejectedElement1, Number> mmElementSequenceNumber = new MMMessageAttribute<RejectedElement1, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectedElement1.mmObject();
			isDerived = false;
			xmlTag = "ElmtSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElementSequenceNumber";
			definition = "Sequence number that allows to easily identify the element that is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(RejectedElement1 obj) {
			return obj.getElementSequenceNumber();
		}

		@Override
		public void setValue(RejectedElement1 obj, Number value) {
			obj.setElementSequenceNumber(value);
		}
	};
	@XmlElement(name = "IndvRjctnRsn", required = true)
	protected Max140Text individualRejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectedElement1
	 * RejectedElement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvRjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for rejecting an individual element."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RejectedElement1, Max140Text> mmIndividualRejectionReason = new MMMessageAttribute<RejectedElement1, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectedElement1.mmObject();
			isDerived = false;
			xmlTag = "IndvRjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualRejectionReason";
			definition = "Reason for rejecting an individual element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(RejectedElement1 obj) {
			return obj.getIndividualRejectionReason();
		}

		@Override
		public void setValue(RejectedElement1 obj, Max140Text value) {
			obj.setIndividualRejectionReason(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RejectedElement1.mmElementSequenceNumber, com.tools20022.repository.msg.RejectedElement1.mmIndividualRejectionReason);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectedElement1";
				definition = "Provides information on the rejection reason of an individual element.";
			}
		});
		return mmObject_lazy.get();
	}

	public Number getElementSequenceNumber() {
		return elementSequenceNumber;
	}

	public RejectedElement1 setElementSequenceNumber(Number elementSequenceNumber) {
		this.elementSequenceNumber = Objects.requireNonNull(elementSequenceNumber);
		return this;
	}

	public Max140Text getIndividualRejectionReason() {
		return individualRejectionReason;
	}

	public RejectedElement1 setIndividualRejectionReason(Max140Text individualRejectionReason) {
		this.individualRejectionReason = Objects.requireNonNull(individualRejectionReason);
		return this;
	}
}