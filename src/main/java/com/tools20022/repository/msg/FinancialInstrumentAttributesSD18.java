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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecurityIdentification20;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD18#mmDeclaredDisbursedSecurityIdentification
 * FinancialInstrumentAttributesSD18.mmDeclaredDisbursedSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD18#mmDeclaredDisbursedSecurityDescription
 * FinancialInstrumentAttributesSD18.mmDeclaredDisbursedSecurityDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentAttributesSD18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding security that will be distributed as part of entitlement."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD2
 * FinancialInstrumentAttributesSD2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributesSD18", propOrder = {"declaredDisbursedSecurityIdentification", "declaredDisbursedSecurityDescription"})
public class FinancialInstrumentAttributesSD18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DclrdDsbrsdSctyId")
	protected SecurityIdentification20 declaredDisbursedSecurityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD18
	 * FinancialInstrumentAttributesSD18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdDsbrsdSctyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredDisbursedSecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security identification of the security that is being distributed as a result of a corporate action as declared by the issuer or offeror on the market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Disbursed Security ID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD2#mmDeclaredDisbursedSecurityIdentification
	 * FinancialInstrumentAttributesSD2.
	 * mmDeclaredDisbursedSecurityIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD18, Optional<SecurityIdentification20>> mmDeclaredDisbursedSecurityIdentification = new MMMessageAttribute<FinancialInstrumentAttributesSD18, Optional<SecurityIdentification20>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD18.mmObject();
			isDerived = false;
			xmlTag = "DclrdDsbrsdSctyId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Disbursed Security ID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredDisbursedSecurityIdentification";
			definition = "Security identification of the security that is being distributed as a result of a corporate action as declared by the issuer or offeror on the market.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD2.mmDeclaredDisbursedSecurityIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification20.mmObject();
		}

		@Override
		public Optional<SecurityIdentification20> getValue(FinancialInstrumentAttributesSD18 obj) {
			return obj.getDeclaredDisbursedSecurityIdentification();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD18 obj, Optional<SecurityIdentification20> value) {
			obj.setDeclaredDisbursedSecurityIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdDsbrsdSctyDesc")
	protected Max140Text declaredDisbursedSecurityDescription;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD18
	 * FinancialInstrumentAttributesSD18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdDsbrsdSctyDesc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredDisbursedSecurityDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Declared disbursed security description."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Security Description (DTC Disbursed
	 * Security)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD2#mmDeclaredDisbursedSecurityDescription
	 * FinancialInstrumentAttributesSD2.mmDeclaredDisbursedSecurityDescription}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributesSD18, Optional<Max140Text>> mmDeclaredDisbursedSecurityDescription = new MMMessageAttribute<FinancialInstrumentAttributesSD18, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD18.mmObject();
			isDerived = false;
			xmlTag = "DclrdDsbrsdSctyDesc";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Security Description (DTC Disbursed Security)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredDisbursedSecurityDescription";
			definition = "Declared disbursed security description.";
			previousVersion_lazy = () -> FinancialInstrumentAttributesSD2.mmDeclaredDisbursedSecurityDescription;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(FinancialInstrumentAttributesSD18 obj) {
			return obj.getDeclaredDisbursedSecurityDescription();
		}

		@Override
		public void setValue(FinancialInstrumentAttributesSD18 obj, Optional<Max140Text> value) {
			obj.setDeclaredDisbursedSecurityDescription(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributesSD18.mmDeclaredDisbursedSecurityIdentification,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD18.mmDeclaredDisbursedSecurityDescription);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributesSD18";
				definition = "Provides additional information regarding security that will be distributed as part of entitlement.";
				previousVersion_lazy = () -> FinancialInstrumentAttributesSD2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecurityIdentification20> getDeclaredDisbursedSecurityIdentification() {
		return declaredDisbursedSecurityIdentification == null ? Optional.empty() : Optional.of(declaredDisbursedSecurityIdentification);
	}

	public FinancialInstrumentAttributesSD18 setDeclaredDisbursedSecurityIdentification(SecurityIdentification20 declaredDisbursedSecurityIdentification) {
		this.declaredDisbursedSecurityIdentification = declaredDisbursedSecurityIdentification;
		return this;
	}

	public Optional<Max140Text> getDeclaredDisbursedSecurityDescription() {
		return declaredDisbursedSecurityDescription == null ? Optional.empty() : Optional.of(declaredDisbursedSecurityDescription);
	}

	public FinancialInstrumentAttributesSD18 setDeclaredDisbursedSecurityDescription(Max140Text declaredDisbursedSecurityDescription) {
		this.declaredDisbursedSecurityDescription = declaredDisbursedSecurityDescription;
		return this;
	}
}