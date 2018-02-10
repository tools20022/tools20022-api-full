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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding security that will being
 * distributed as part of entitlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD4#mmCSDDisbursedSecurityIdentification
 * FinancialInstrumentAttributesSD4.mmCSDDisbursedSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD4#mmCSDDisbursedSecurityDescription
 * FinancialInstrumentAttributesSD4.mmCSDDisbursedSecurityDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD4#mmCSDDisbursedFractionalSecurityIdentification
 * FinancialInstrumentAttributesSD4.
 * mmCSDDisbursedFractionalSecurityIdentification}</li>
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
 * "FinancialInstrumentAttributesSD4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding security that will being distributed as part of entitlement."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributesSD4", propOrder = {"cSDDisbursedSecurityIdentification", "cSDDisbursedSecurityDescription", "cSDDisbursedFractionalSecurityIdentification"})
public class FinancialInstrumentAttributesSD4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CSDDsbrsdSctyId")
	protected SecurityIdentification15 cSDDisbursedSecurityIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD4
	 * FinancialInstrumentAttributesSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSDDsbrsdSctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Disbursed Security ID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDDisbursedSecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security identification that a CSD (for example in the US -  DTC, The Depository Trust Corporation) will distribute as part of the entitlement. This can be the DTC contra CUSIP in cases where the payout security is a contra CUSIP."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCSDDisbursedSecurityIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD4.mmObject();
			isDerived = false;
			xmlTag = "CSDDsbrsdSctyId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Disbursed Security ID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDDisbursedSecurityIdentification";
			definition = "Security identification that a CSD (for example in the US -  DTC, The Depository Trust Corporation) will distribute as part of the entitlement. This can be the DTC contra CUSIP in cases where the payout security is a contra CUSIP.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification15.mmObject();
		}
	};
	@XmlElement(name = "CSDDsbrsdSctyDesc")
	protected Max140Text cSDDisbursedSecurityDescription;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD4
	 * FinancialInstrumentAttributesSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSDDsbrsdSctyDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Security Description (DTC Disbursed
	 * Security)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDDisbursedSecurityDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTC (The Depository Trust Corporation) disbursed security description."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCSDDisbursedSecurityDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD4.mmObject();
			isDerived = false;
			xmlTag = "CSDDsbrsdSctyDesc";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Security Description (DTC Disbursed Security)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDDisbursedSecurityDescription";
			definition = "DTC (The Depository Trust Corporation) disbursed security description.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	@XmlElement(name = "CSDDsbrsdFrctnlSctyId")
	protected SecurityIdentification15 cSDDisbursedFractionalSecurityIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributesSD4
	 * FinancialInstrumentAttributesSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSDDsbrsdFrctnlSctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Disbursed Fractional Security ID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDDisbursedFractionalSecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security identification of the security that will be distributed in fractions by the CSD (for example in the US -  DTC, The Depository Trust Corporation) DTC (The Depository Trust Corporation) as a result of a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCSDDisbursedFractionalSecurityIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributesSD4.mmObject();
			isDerived = false;
			xmlTag = "CSDDsbrsdFrctnlSctyId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Disbursed Fractional Security ID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDDisbursedFractionalSecurityIdentification";
			definition = "Security identification of the security that will be distributed in fractions by the CSD (for example in the US -  DTC, The Depository Trust Corporation) DTC (The Depository Trust Corporation) as a result of a corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification15.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributesSD4.mmCSDDisbursedSecurityIdentification,
						com.tools20022.repository.msg.FinancialInstrumentAttributesSD4.mmCSDDisbursedSecurityDescription, com.tools20022.repository.msg.FinancialInstrumentAttributesSD4.mmCSDDisbursedFractionalSecurityIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributesSD4";
				definition = "Provides additional information regarding security that will being distributed as part of entitlement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecurityIdentification15> getCSDDisbursedSecurityIdentification() {
		return cSDDisbursedSecurityIdentification == null ? Optional.empty() : Optional.of(cSDDisbursedSecurityIdentification);
	}

	public FinancialInstrumentAttributesSD4 setCSDDisbursedSecurityIdentification(com.tools20022.repository.msg.SecurityIdentification15 cSDDisbursedSecurityIdentification) {
		this.cSDDisbursedSecurityIdentification = cSDDisbursedSecurityIdentification;
		return this;
	}

	public Optional<Max140Text> getCSDDisbursedSecurityDescription() {
		return cSDDisbursedSecurityDescription == null ? Optional.empty() : Optional.of(cSDDisbursedSecurityDescription);
	}

	public FinancialInstrumentAttributesSD4 setCSDDisbursedSecurityDescription(Max140Text cSDDisbursedSecurityDescription) {
		this.cSDDisbursedSecurityDescription = cSDDisbursedSecurityDescription;
		return this;
	}

	public Optional<SecurityIdentification15> getCSDDisbursedFractionalSecurityIdentification() {
		return cSDDisbursedFractionalSecurityIdentification == null ? Optional.empty() : Optional.of(cSDDisbursedFractionalSecurityIdentification);
	}

	public FinancialInstrumentAttributesSD4 setCSDDisbursedFractionalSecurityIdentification(com.tools20022.repository.msg.SecurityIdentification15 cSDDisbursedFractionalSecurityIdentification) {
		this.cSDDisbursedFractionalSecurityIdentification = cSDDisbursedFractionalSecurityIdentification;
		return this;
	}
}