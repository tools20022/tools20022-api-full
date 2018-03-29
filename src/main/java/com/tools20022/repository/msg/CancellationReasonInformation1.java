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
import com.tools20022.repository.choice.CancellationReason1Choice;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification8;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Further information on the cancellation reason of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation1#mmCancellationOriginator
 * CancellationReasonInformation1.mmCancellationOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation1#mmCancellationReason
 * CancellationReasonInformation1.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation1#mmAdditionalCancellationReasonInformation
 * CancellationReasonInformation1.mmAdditionalCancellationReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentStatus
 * PaymentStatus}</li>
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
 * "CancellationReasonInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further information on the cancellation reason of the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CancellationReasonInformation1", propOrder = {"cancellationOriginator", "cancellationReason", "additionalCancellationReasonInformation"})
public class CancellationReasonInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlOrgtr")
	protected PartyIdentification8 cancellationOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification8
	 * PartyIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation1
	 * CancellationReasonInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party issuing the cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CancellationReasonInformation1, Optional<PartyIdentification8>> mmCancellationOriginator = new MMMessageAssociationEnd<CancellationReasonInformation1, Optional<PartyIdentification8>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationReasonInformation1.mmObject();
			isDerived = false;
			xmlTag = "CxlOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationOriginator";
			definition = "Party issuing the cancellation request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification8.mmObject();
		}

		@Override
		public Optional<PartyIdentification8> getValue(CancellationReasonInformation1 obj) {
			return obj.getCancellationOriginator();
		}

		@Override
		public void setValue(CancellationReasonInformation1 obj, Optional<PartyIdentification8> value) {
			obj.setCancellationOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRsn")
	protected CancellationReason1Choice cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationReason1Choice
	 * CancellationReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmCancellationReason
	 * PaymentStatus.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation1
	 * CancellationReasonInformation1}</li>
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
	 * definition} = "Specifies the reason for the cancellation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CancellationReasonInformation1, Optional<CancellationReason1Choice>> mmCancellationReason = new MMMessageAssociationEnd<CancellationReasonInformation1, Optional<CancellationReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationReasonInformation1.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason for the cancellation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CancellationReason1Choice.mmObject();
		}

		@Override
		public Optional<CancellationReason1Choice> getValue(CancellationReasonInformation1 obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(CancellationReasonInformation1 obj, Optional<CancellationReason1Choice> value) {
			obj.setCancellationReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlCxlRsnInf")
	protected List<Max105Text> additionalCancellationReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationReasonInformation1
	 * CancellationReasonInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCxlRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCancellationReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further details on the cancellation request reason.\n\nUsage: Additional cancellation reason information can be used to further detail the cancellation request reason."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CancellationReasonInformation1, List<Max105Text>> mmAdditionalCancellationReasonInformation = new MMMessageAttribute<CancellationReasonInformation1, List<Max105Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CancellationReasonInformation1.mmObject();
			isDerived = false;
			xmlTag = "AddtlCxlRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCancellationReasonInformation";
			definition = "Further details on the cancellation request reason.\n\nUsage: Additional cancellation reason information can be used to further detail the cancellation request reason.";
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public List<Max105Text> getValue(CancellationReasonInformation1 obj) {
			return obj.getAdditionalCancellationReasonInformation();
		}

		@Override
		public void setValue(CancellationReasonInformation1 obj, List<Max105Text> value) {
			obj.setAdditionalCancellationReasonInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CancellationReasonInformation1.mmCancellationOriginator, com.tools20022.repository.msg.CancellationReasonInformation1.mmCancellationReason,
						com.tools20022.repository.msg.CancellationReasonInformation1.mmAdditionalCancellationReasonInformation);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationReasonInformation1";
				definition = "Further information on the cancellation reason of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification8> getCancellationOriginator() {
		return cancellationOriginator == null ? Optional.empty() : Optional.of(cancellationOriginator);
	}

	public CancellationReasonInformation1 setCancellationOriginator(PartyIdentification8 cancellationOriginator) {
		this.cancellationOriginator = cancellationOriginator;
		return this;
	}

	public Optional<CancellationReason1Choice> getCancellationReason() {
		return cancellationReason == null ? Optional.empty() : Optional.of(cancellationReason);
	}

	public CancellationReasonInformation1 setCancellationReason(CancellationReason1Choice cancellationReason) {
		this.cancellationReason = cancellationReason;
		return this;
	}

	public List<Max105Text> getAdditionalCancellationReasonInformation() {
		return additionalCancellationReasonInformation == null ? additionalCancellationReasonInformation = new ArrayList<>() : additionalCancellationReasonInformation;
	}

	public CancellationReasonInformation1 setAdditionalCancellationReasonInformation(List<Max105Text> additionalCancellationReasonInformation) {
		this.additionalCancellationReasonInformation = Objects.requireNonNull(additionalCancellationReasonInformation);
		return this;
	}
}