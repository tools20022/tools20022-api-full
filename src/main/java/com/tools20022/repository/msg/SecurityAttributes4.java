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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6;
import com.tools20022.repository.msg.FinancialInstrument54;
import com.tools20022.repository.msg.SecurityIdentification19;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tangible items of value to a business.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityAttributes4#mmFinancialInstrumentIdentification
 * SecurityAttributes4.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityAttributes4#mmFinancialInstrumentType
 * SecurityAttributes4.mmFinancialInstrumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityAttributes4#mmFinancialInstrumentAttributes
 * SecurityAttributes4.mmFinancialInstrumentAttributes}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityAttributes4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tangible items of value to a business."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityAttributes3
 * SecurityAttributes3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityAttributes4", propOrder = {"financialInstrumentIdentification", "financialInstrumentType", "financialInstrumentAttributes"})
public class SecurityAttributes4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId")
	protected List<SecurityIdentification19> financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes4
	 * SecurityAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Way(s) of identifying the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes3#mmFinancialInstrumentIdentification
	 * SecurityAttributes3.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityAttributes4, List<SecurityIdentification19>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<SecurityAttributes4, List<SecurityIdentification19>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityAttributes4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Way(s) of identifying the security.";
			previousVersion_lazy = () -> SecurityAttributes3.mmFinancialInstrumentIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public List<SecurityIdentification19> getValue(SecurityAttributes4 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecurityAttributes4 obj, List<SecurityIdentification19> value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmTp")
	protected FinancialInstrument54 financialInstrumentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument54
	 * FinancialInstrument54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes4
	 * SecurityAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional details about the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes3#mmFinancialInstrumentType
	 * SecurityAttributes3.mmFinancialInstrumentType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityAttributes4, Optional<FinancialInstrument54>> mmFinancialInstrumentType = new MMMessageAssociationEnd<SecurityAttributes4, Optional<FinancialInstrument54>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityAttributes4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentType";
			definition = "Provides additional details about the financial instrument.";
			previousVersion_lazy = () -> SecurityAttributes3.mmFinancialInstrumentType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument54.mmObject();
		}

		@Override
		public Optional<FinancialInstrument54> getValue(SecurityAttributes4 obj) {
			return obj.getFinancialInstrumentType();
		}

		@Override
		public void setValue(SecurityAttributes4 obj, Optional<FinancialInstrument54> value) {
			obj.setFinancialInstrumentType(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected List<CommonFinancialInstrumentAttributes6> financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes6
	 * CommonFinancialInstrumentAttributes6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes4
	 * SecurityAttributes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes3#mmFinancialInstrumentAttributes
	 * SecurityAttributes3.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityAttributes4, List<CommonFinancialInstrumentAttributes6>> mmFinancialInstrumentAttributes = new MMMessageAssociationEnd<SecurityAttributes4, List<CommonFinancialInstrumentAttributes6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityAttributes4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			previousVersion_lazy = () -> SecurityAttributes3.mmFinancialInstrumentAttributes;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommonFinancialInstrumentAttributes6.mmObject();
		}

		@Override
		public List<CommonFinancialInstrumentAttributes6> getValue(SecurityAttributes4 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecurityAttributes4 obj, List<CommonFinancialInstrumentAttributes6> value) {
			obj.setFinancialInstrumentAttributes(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityAttributes4.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.SecurityAttributes4.mmFinancialInstrumentType,
						com.tools20022.repository.msg.SecurityAttributes4.mmFinancialInstrumentAttributes);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityAttributes4";
				definition = "Tangible items of value to a business.";
				previousVersion_lazy = () -> SecurityAttributes3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecurityIdentification19> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? financialInstrumentIdentification = new ArrayList<>() : financialInstrumentIdentification;
	}

	public SecurityAttributes4 setFinancialInstrumentIdentification(List<SecurityIdentification19> financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrument54> getFinancialInstrumentType() {
		return financialInstrumentType == null ? Optional.empty() : Optional.of(financialInstrumentType);
	}

	public SecurityAttributes4 setFinancialInstrumentType(FinancialInstrument54 financialInstrumentType) {
		this.financialInstrumentType = financialInstrumentType;
		return this;
	}

	public List<CommonFinancialInstrumentAttributes6> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? financialInstrumentAttributes = new ArrayList<>() : financialInstrumentAttributes;
	}

	public SecurityAttributes4 setFinancialInstrumentAttributes(List<CommonFinancialInstrumentAttributes6> financialInstrumentAttributes) {
		this.financialInstrumentAttributes = Objects.requireNonNull(financialInstrumentAttributes);
		return this;
	}
}