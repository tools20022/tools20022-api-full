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
import com.tools20022.repository.choice.PreviousYearChoice;
import com.tools20022.repository.codeset.ISAType1Code;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Year in which the ISA plan is issued.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue#mmCurrentYear
 * ISAYearsOfIssue.mmCurrentYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue#mmPreviousYears
 * ISAYearsOfIssue.mmPreviousYears}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrentYearRule#forISAYearsOfIssue
 * ConstraintCurrentYearRule.forISAYearsOfIssue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISAYearsOfIssue"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Year in which the ISA plan is issued."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ISAYearsOfIssue", propOrder = {"currentYear", "previousYears"})
public class ISAYearsOfIssue {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurYr")
	protected ISAType1Code currentYear;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ISAType1Code
	 * ISAType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCurrentYearISAType
	 * PortfolioTransfer.mmCurrentYearISAType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue
	 * ISAYearsOfIssue}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurYr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ISA that was issued during the current fiscal year."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentYear = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmCurrentYearISAType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue.mmObject();
			isDerived = false;
			xmlTag = "CurYr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYear";
			definition = "ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISAType1Code.mmObject();
		}
	};
	@XmlElement(name = "PrvsYrs")
	protected PreviousYearChoice previousYears;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PreviousYearChoice
	 * PreviousYearChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue
	 * ISAYearsOfIssue}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the year during which the investment plan was issued."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviousYears = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue.mmObject();
			isDerived = false;
			xmlTag = "PrvsYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousYears";
			definition = "Specifies the year during which the investment plan was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PreviousYearChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue.mmCurrentYear, com.tools20022.repository.msg.ISAYearsOfIssue.mmPreviousYears);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrentYearRule.forISAYearsOfIssue);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ISAYearsOfIssue";
				definition = "Year in which the ISA plan is issued.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISAType1Code> getCurrentYear() {
		return currentYear == null ? Optional.empty() : Optional.of(currentYear);
	}

	public ISAYearsOfIssue setCurrentYear(ISAType1Code currentYear) {
		this.currentYear = currentYear;
		return this;
	}

	public Optional<PreviousYearChoice> getPreviousYears() {
		return previousYears == null ? Optional.empty() : Optional.of(previousYears);
	}

	public ISAYearsOfIssue setPreviousYears(PreviousYearChoice previousYears) {
		this.previousYears = previousYears;
		return this;
	}
}