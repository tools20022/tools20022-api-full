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
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.entity.Expiry;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExpiryTerms1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Expiry and extension information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExpiryDetails1#mmExpiryTerms
 * ExpiryDetails1.mmExpiryTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpiryDetails1#mmAdditionalExpiryInformation
 * ExpiryDetails1.mmAdditionalExpiryInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Expiry Expiry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExpiryDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Expiry and extension information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExpiryDetails1", propOrder = {"expiryTerms", "additionalExpiryInformation"})
public class ExpiryDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XpryTerms")
	protected ExpiryTerms1 expiryTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExpiryTerms1
	 * ExpiryTerms1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmExpiry
	 * Undertaking.mmExpiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpiryDetails1 ExpiryDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryTerms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terms defining when the undertaking will cease to be available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ExpiryDetails1, Optional<ExpiryTerms1>> mmExpiryTerms = new MMMessageAssociationEnd<ExpiryDetails1, Optional<ExpiryTerms1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpiryDetails1.mmObject();
			isDerived = false;
			xmlTag = "XpryTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryTerms";
			definition = "Terms defining when the undertaking will cease to be available.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExpiryTerms1.mmObject();
		}

		@Override
		public Optional<ExpiryTerms1> getValue(ExpiryDetails1 obj) {
			return obj.getExpiryTerms();
		}

		@Override
		public void setValue(ExpiryDetails1 obj, Optional<ExpiryTerms1> value) {
			obj.setExpiryTerms(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlXpryInf")
	protected List<Max2000Text> additionalExpiryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpiryDetails1 ExpiryDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlXpryInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalExpiryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the expiry and expiry extension."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpiryDetails1, List<Max2000Text>> mmAdditionalExpiryInformation = new MMMessageAttribute<ExpiryDetails1, List<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpiryDetails1.mmObject();
			isDerived = false;
			xmlTag = "AddtlXpryInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalExpiryInformation";
			definition = "Additional information related to the expiry and expiry extension.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public List<Max2000Text> getValue(ExpiryDetails1 obj) {
			return obj.getAdditionalExpiryInformation();
		}

		@Override
		public void setValue(ExpiryDetails1 obj, List<Max2000Text> value) {
			obj.setAdditionalExpiryInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpiryDetails1.mmExpiryTerms, com.tools20022.repository.msg.ExpiryDetails1.mmAdditionalExpiryInformation);
				trace_lazy = () -> Expiry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExpiryDetails1";
				definition = "Expiry and extension information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ExpiryTerms1> getExpiryTerms() {
		return expiryTerms == null ? Optional.empty() : Optional.of(expiryTerms);
	}

	public ExpiryDetails1 setExpiryTerms(ExpiryTerms1 expiryTerms) {
		this.expiryTerms = expiryTerms;
		return this;
	}

	public List<Max2000Text> getAdditionalExpiryInformation() {
		return additionalExpiryInformation == null ? additionalExpiryInformation = new ArrayList<>() : additionalExpiryInformation;
	}

	public ExpiryDetails1 setAdditionalExpiryInformation(List<Max2000Text> additionalExpiryInformation) {
		this.additionalExpiryInformation = Objects.requireNonNull(additionalExpiryInformation);
		return this;
	}
}