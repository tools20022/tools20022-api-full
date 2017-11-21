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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding security that will be distributed
 * as part of entitlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD2#mmDeclaredDisbursedSecurityIdentification
 * FinancialInstrumentAttributesSD2.mmDeclaredDisbursedSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD2#mmDeclaredDisbursedSecurityDescription
 * FinancialInstrumentAttributesSD2.mmDeclaredDisbursedSecurityDescription}</li>
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
 * "FinancialInstrumentAttributesSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding security that will be distributed as part of entitlement."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentAttributesSD2", propOrder = {"declaredDisbursedSecurityIdentification", "declaredDisbursedSecurityDescription"})
public class FinancialInstrumentAttributesSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification15 declaredDisbursedSecurityIdentification;
	/**
	 * Security identification of the security that is being distributed as a
	 * result of a corporate action as declared by the issuer or offeror on the
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification15
	 * SecurityIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD2
	 * FinancialInstrumentAttributesSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdDsbrsdSctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredDisbursedSecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security identification of the security that is being distributed as a result of a corporate action as declared by the issuer or offeror on the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredDisbursedSecurityIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD2.mmObject();
			isDerived = false;
			xmlTag = "DclrdDsbrsdSctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredDisbursedSecurityIdentification";
			definition = "Security identification of the security that is being distributed as a result of a corporate action as declared by the issuer or offeror on the market.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification15.mmObject();
		}
	};
	protected Max140Text declaredDisbursedSecurityDescription;
	/**
	 * Declared disbursed security description.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD2
	 * FinancialInstrumentAttributesSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdDsbrsdSctyDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredDisbursedSecurityDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Declared disbursed security description."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclaredDisbursedSecurityDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrumentAttributesSD2.mmObject();
			isDerived = false;
			xmlTag = "DclrdDsbrsdSctyDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredDisbursedSecurityDescription";
			definition = "Declared disbursed security description.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentAttributesSD2.mmDeclaredDisbursedSecurityIdentification, FinancialInstrumentAttributesSD2.mmDeclaredDisbursedSecurityDescription);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributesSD2";
				definition = "Provides additional information regarding security that will be distributed as part of entitlement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DclrdDsbrsdSctyId")
	public SecurityIdentification15 getDeclaredDisbursedSecurityIdentification() {
		return declaredDisbursedSecurityIdentification;
	}

	public void setDeclaredDisbursedSecurityIdentification(com.tools20022.repository.msg.SecurityIdentification15 declaredDisbursedSecurityIdentification) {
		this.declaredDisbursedSecurityIdentification = declaredDisbursedSecurityIdentification;
	}

	@XmlElement(name = "DclrdDsbrsdSctyDesc")
	public Max140Text getDeclaredDisbursedSecurityDescription() {
		return declaredDisbursedSecurityDescription;
	}

	public void setDeclaredDisbursedSecurityDescription(Max140Text declaredDisbursedSecurityDescription) {
		this.declaredDisbursedSecurityDescription = declaredDisbursedSecurityDescription;
	}
}