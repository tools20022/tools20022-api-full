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
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrument59;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Repurchase agreement where the agreement allows for the sale and repurchase
 * of any of a selection of assets from a pool of eligible assets.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralCollateral3#mmFinancialInstrumentIdentification
 * GeneralCollateral3.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralCollateral3#mmEligibleFinancialInstrumentIdentification
 * GeneralCollateral3.mmEligibleFinancialInstrumentIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GeneralCollateral3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Repurchase agreement where the agreement allows for the sale and repurchase of any of a selection of assets from a pool of eligible assets."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.GeneralCollateral2
 * GeneralCollateral2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GeneralCollateral3", propOrder = {"financialInstrumentIdentification", "eligibleFinancialInstrumentIdentification"})
public class GeneralCollateral3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId")
	protected List<FinancialInstrument59> financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument59
	 * FinancialInstrument59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
	 * SecuritiesIdentification.mmGenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralCollateral3
	 * GeneralCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISINs of allocated securities of general collateral where known.\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GeneralCollateral3, List<FinancialInstrument59>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<GeneralCollateral3, List<FinancialInstrument59>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmGenericIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralCollateral3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "ISINs of allocated securities of general collateral where known.\r\n";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument59.mmObject();
		}

		@Override
		public List<FinancialInstrument59> getValue(GeneralCollateral3 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(GeneralCollateral3 obj, List<FinancialInstrument59> value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "ElgblFinInstrmId")
	protected List<ISINOct2015Identifier> eligibleFinancialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralCollateral3
	 * GeneralCollateral3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblFinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleFinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "List of eligible securities to be allocated where known.\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GeneralCollateral2#mmEligibleFinancialInstrumentIdentification
	 * GeneralCollateral2.mmEligibleFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeneralCollateral3, List<ISINOct2015Identifier>> mmEligibleFinancialInstrumentIdentification = new MMMessageAttribute<GeneralCollateral3, List<ISINOct2015Identifier>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralCollateral3.mmObject();
			isDerived = false;
			xmlTag = "ElgblFinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleFinancialInstrumentIdentification";
			definition = "List of eligible securities to be allocated where known.\r\n";
			previousVersion_lazy = () -> GeneralCollateral2.mmEligibleFinancialInstrumentIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public List<ISINOct2015Identifier> getValue(GeneralCollateral3 obj) {
			return obj.getEligibleFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(GeneralCollateral3 obj, List<ISINOct2015Identifier> value) {
			obj.setEligibleFinancialInstrumentIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralCollateral3.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.GeneralCollateral3.mmEligibleFinancialInstrumentIdentification);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GeneralCollateral3";
				definition = "Repurchase agreement where the agreement allows for the sale and repurchase of any of a selection of assets from a pool of eligible assets.";
				previousVersion_lazy = () -> GeneralCollateral2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<FinancialInstrument59> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? financialInstrumentIdentification = new ArrayList<>() : financialInstrumentIdentification;
	}

	public GeneralCollateral3 setFinancialInstrumentIdentification(List<FinancialInstrument59> financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public List<ISINOct2015Identifier> getEligibleFinancialInstrumentIdentification() {
		return eligibleFinancialInstrumentIdentification == null ? eligibleFinancialInstrumentIdentification = new ArrayList<>() : eligibleFinancialInstrumentIdentification;
	}

	public GeneralCollateral3 setEligibleFinancialInstrumentIdentification(List<ISINOct2015Identifier> eligibleFinancialInstrumentIdentification) {
		this.eligibleFinancialInstrumentIdentification = Objects.requireNonNull(eligibleFinancialInstrumentIdentification);
		return this;
	}
}