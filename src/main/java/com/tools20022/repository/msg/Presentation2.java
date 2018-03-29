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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Presentation;
import com.tools20022.repository.entity.UndertakingPresenter;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification43;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information for the presentation of documents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Presentation2#mmPresenter
 * Presentation2.mmPresenter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Presentation2#mmBeneficiaryPresentationDate
 * Presentation2.mmBeneficiaryPresentationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Presentation
 * Presentation}</li>
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
 * "Presentation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information for the presentation of documents."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Presentation2", propOrder = {"presenter", "beneficiaryPresentationDate"})
public class Presentation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Presntr")
	protected PartyIdentification43 presenter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingPresenter
	 * UndertakingPresenter}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Presentation2 Presentation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Presntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Presenter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party, other than beneficiary, forwarding the documents."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Presentation2, Optional<PartyIdentification43>> mmPresenter = new MMMessageAssociationEnd<Presentation2, Optional<PartyIdentification43>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingPresenter.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Presentation2.mmObject();
			isDerived = false;
			xmlTag = "Presntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Presenter";
			definition = "Party, other than beneficiary, forwarding the documents.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(Presentation2 obj) {
			return obj.getPresenter();
		}

		@Override
		public void setValue(Presentation2 obj, Optional<PartyIdentification43> value) {
			obj.setPresenter(value.orElse(null));
		}
	};
	@XmlElement(name = "BnfcryPresntnDt")
	protected ISODate beneficiaryPresentationDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmPresentationDate
	 * Presentation.mmPresentationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Presentation2 Presentation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryPresntnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryPresentationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the beneficiary presented the demand."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Presentation2, Optional<ISODate>> mmBeneficiaryPresentationDate = new MMMessageAttribute<Presentation2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Presentation.mmPresentationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Presentation2.mmObject();
			isDerived = false;
			xmlTag = "BnfcryPresntnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryPresentationDate";
			definition = "Date on which the beneficiary presented the demand.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Presentation2 obj) {
			return obj.getBeneficiaryPresentationDate();
		}

		@Override
		public void setValue(Presentation2 obj, Optional<ISODate> value) {
			obj.setBeneficiaryPresentationDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Presentation2.mmPresenter, com.tools20022.repository.msg.Presentation2.mmBeneficiaryPresentationDate);
				trace_lazy = () -> Presentation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Presentation2";
				definition = "Information for the presentation of documents.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification43> getPresenter() {
		return presenter == null ? Optional.empty() : Optional.of(presenter);
	}

	public Presentation2 setPresenter(PartyIdentification43 presenter) {
		this.presenter = presenter;
		return this;
	}

	public Optional<ISODate> getBeneficiaryPresentationDate() {
		return beneficiaryPresentationDate == null ? Optional.empty() : Optional.of(beneficiaryPresentationDate);
	}

	public Presentation2 setBeneficiaryPresentationDate(ISODate beneficiaryPresentationDate) {
		this.beneficiaryPresentationDate = beneficiaryPresentationDate;
		return this;
	}
}