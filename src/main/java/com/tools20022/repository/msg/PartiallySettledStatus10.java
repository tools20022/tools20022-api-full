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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartiallySettled21Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.StatusReason;
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
 * Reason for a partially settled status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10#mmReason
 * PartiallySettledStatus10.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10#mmAdditionalInformation
 * PartiallySettledStatus10.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartiallySettledStatus10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for a partially settled status."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus1
 * PartiallySettledStatus1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartiallySettledStatus10", propOrder = {"reason", "additionalInformation"})
public class PartiallySettledStatus10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rsn", required = true)
	protected PartiallySettled21Choice reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartiallySettled21Choice
	 * PartiallySettled21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmPartiallySettledStatusReason
	 * SecuritiesOrderStatus.mmPartiallySettledStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10
	 * PartiallySettledStatus10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the partially settled status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus9#mmReason
	 * RejectedStatus9.mmReason}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartiallySettledStatus10, PartiallySettled21Choice> mmReason = new MMMessageAssociationEnd<PartiallySettledStatus10, PartiallySettled21Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmPartiallySettledStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartiallySettledStatus10.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the partially settled status.";
			previousVersion_lazy = () -> RejectedStatus9.mmReason;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartiallySettled21Choice.mmObject();
		}

		@Override
		public PartiallySettled21Choice getValue(PartiallySettledStatus10 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(PartiallySettledStatus10 obj, PartiallySettled21Choice value) {
			obj.setReason(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max350Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartiallySettledStatus10
	 * PartiallySettledStatus10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the partially settled reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RejectedStatus9#mmAdditionalInformation
	 * RejectedStatus9.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartiallySettledStatus10, Optional<Max350Text>> mmAdditionalInformation = new MMMessageAttribute<PartiallySettledStatus10, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartiallySettledStatus10.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the partially settled reason.";
			previousVersion_lazy = () -> RejectedStatus9.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(PartiallySettledStatus10 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(PartiallySettledStatus10 obj, Optional<Max350Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartiallySettledStatus10.mmReason, com.tools20022.repository.msg.PartiallySettledStatus10.mmAdditionalInformation);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartiallySettledStatus10";
				definition = "Reason for a partially settled status.";
				previousVersion_lazy = () -> PartiallySettledStatus1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartiallySettled21Choice getReason() {
		return reason;
	}

	public PartiallySettledStatus10 setReason(PartiallySettled21Choice reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public Optional<Max350Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public PartiallySettledStatus10 setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}