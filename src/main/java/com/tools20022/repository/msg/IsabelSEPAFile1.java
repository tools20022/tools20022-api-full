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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the characteristics for a SEPA formatted payment initiation file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1#mmSEPAIndicator
 * IsabelSEPAFile1.mmSEPAIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1#mmCategoryPurpose
 * IsabelSEPAFile1.mmCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1#mmMarketPractices
 * IsabelSEPAFile1.mmMarketPractices}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelSEPAFile1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the characteristics for a SEPA formatted payment initiation file."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IsabelSEPAFile1", propOrder = {"SEPAIndicator", "categoryPurpose", "marketPractices"})
public class IsabelSEPAFile1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator sEPAIndicator;
	/**
	 * Specifies whether the SEPA formatted file is compliant to the SEPA
	 * rulebook.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1
	 * IsabelSEPAFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SEPAInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPAIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the SEPA formatted file is compliant to the SEPA rulebook."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSEPAIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelSEPAFile1.mmObject();
			isDerived = false;
			xmlTag = "SEPAInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPAIndicator";
			definition = "Specifies whether the SEPA formatted file is compliant to the SEPA rulebook.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected Max6Text categoryPurpose;
	/**
	 * High level category purpose of the payment initiation messages in the
	 * file, based on the SEPA rulebook.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1
	 * IsabelSEPAFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "High level category purpose of the payment initiation messages in the file, based on the SEPA rulebook."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCategoryPurpose = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelSEPAFile1.mmObject();
			isDerived = false;
			xmlTag = "CtgyPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryPurpose";
			definition = "High level category purpose of the payment initiation messages in the file, based on the SEPA rulebook.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}
	};
	protected List<Max35Text> marketPractices;
	/**
	 * Local market practices applicable to the SEPA file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1
	 * IsabelSEPAFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPractices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local market practices applicable to the SEPA file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketPractices = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IsabelSEPAFile1.mmObject();
			isDerived = false;
			xmlTag = "MktPrctcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPractices";
			definition = "Local market practices applicable to the SEPA file.";
			maxOccurs = 10;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IsabelSEPAFile1.mmSEPAIndicator, IsabelSEPAFile1.mmCategoryPurpose, IsabelSEPAFile1.mmMarketPractices);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelSEPAFile1";
				definition = "Specifies the characteristics for a SEPA formatted payment initiation file.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SEPAInd", required = true)
	public TrueFalseIndicator getSEPAIndicator() {
		return sEPAIndicator;
	}

	public void setSEPAIndicator(TrueFalseIndicator sEPAIndicator) {
		this.sEPAIndicator = sEPAIndicator;
	}

	@XmlElement(name = "CtgyPurp", required = true)
	public Max6Text getCategoryPurpose() {
		return categoryPurpose;
	}

	public void setCategoryPurpose(Max6Text categoryPurpose) {
		this.categoryPurpose = categoryPurpose;
	}

	@XmlElement(name = "MktPrctcs")
	public List<Max35Text> getMarketPractices() {
		return marketPractices;
	}

	public void setMarketPractices(List<Max35Text> marketPractices) {
		this.marketPractices = marketPractices;
	}
}