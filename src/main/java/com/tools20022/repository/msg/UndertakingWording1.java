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
import com.tools20022.repository.codeset.ISO2ALanguageCode;
import com.tools20022.repository.entity.ModelForm;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the wording for a demand guarantee, standby letter of
 * credit or other undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingWording1#mmModelForm
 * UndertakingWording1.mmModelForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingWording1#mmRequestedWordingLanguage
 * UndertakingWording1.mmRequestedWordingLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingWording1#mmUndertakingTermsAndConditions
 * UndertakingWording1.mmUndertakingTermsAndConditions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ModelForm ModelForm}</li>
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
 * "UndertakingWording1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the wording for a demand guarantee, standby letter of credit or other undertaking."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UndertakingWording1", propOrder = {"modelForm", "requestedWordingLanguage", "undertakingTermsAndConditions"})
public class UndertakingWording1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MdlForm")
	protected ModelFormIdentification1 modelForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ModelFormIdentification1
	 * ModelFormIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ModelForm ModelForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingWording1
	 * UndertakingWording1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdlForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModelForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wording template for the undertaking content made available for use with certain governance rules or made available by particular institutions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModelForm = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ModelForm.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingWording1.mmObject();
			isDerived = false;
			xmlTag = "MdlForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModelForm";
			definition = "Wording template for the undertaking content made available for use with certain governance rules or made available by particular institutions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ModelFormIdentification1.mmObject();
		}
	};
	@XmlElement(name = "ReqdWrdgLang")
	protected ISO2ALanguageCode requestedWordingLanguage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ModelForm#mmRequestedWordingLanguage
	 * ModelForm.mmRequestedWordingLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingWording1
	 * UndertakingWording1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdWrdgLang"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedWordingLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language of the standard wording provided by the issuer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedWordingLanguage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ModelForm.mmRequestedWordingLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingWording1.mmObject();
			isDerived = false;
			xmlTag = "ReqdWrdgLang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedWordingLanguage";
			definition = "Language of the standard wording provided by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}
	};
	@XmlElement(name = "UdrtkgTermsAndConds")
	protected List<com.tools20022.repository.msg.Narrative1> undertakingTermsAndConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Narrative1 Narrative1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingWording1
	 * UndertakingWording1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgTermsAndConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingTermsAndConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terms and conditions of the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUndertakingTermsAndConditions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingWording1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgTermsAndConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingTermsAndConditions";
			definition = "Terms and conditions of the undertaking.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Narrative1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingWording1.mmModelForm, com.tools20022.repository.msg.UndertakingWording1.mmRequestedWordingLanguage,
						com.tools20022.repository.msg.UndertakingWording1.mmUndertakingTermsAndConditions);
				trace_lazy = () -> ModelForm.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingWording1";
				definition = "Information about the wording for a demand guarantee, standby letter of credit or other undertaking.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ModelFormIdentification1> getModelForm() {
		return modelForm == null ? Optional.empty() : Optional.of(modelForm);
	}

	public UndertakingWording1 setModelForm(com.tools20022.repository.msg.ModelFormIdentification1 modelForm) {
		this.modelForm = modelForm;
		return this;
	}

	public Optional<ISO2ALanguageCode> getRequestedWordingLanguage() {
		return requestedWordingLanguage == null ? Optional.empty() : Optional.of(requestedWordingLanguage);
	}

	public UndertakingWording1 setRequestedWordingLanguage(ISO2ALanguageCode requestedWordingLanguage) {
		this.requestedWordingLanguage = requestedWordingLanguage;
		return this;
	}

	public List<Narrative1> getUndertakingTermsAndConditions() {
		return undertakingTermsAndConditions == null ? undertakingTermsAndConditions = new ArrayList<>() : undertakingTermsAndConditions;
	}

	public UndertakingWording1 setUndertakingTermsAndConditions(List<com.tools20022.repository.msg.Narrative1> undertakingTermsAndConditions) {
		this.undertakingTermsAndConditions = Objects.requireNonNull(undertakingTermsAndConditions);
		return this;
	}
}