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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Portfolio;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ISAYearsOfIssue4;
import com.tools20022.repository.msg.Portfolio1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice to provide additional portfolio information or individual savings
 * account information (UK government scheme provided by UK based financial
 * institutions only).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ISAPortfolio1Choice#mmISA
 * ISAPortfolio1Choice.mmISA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ISAPortfolio1Choice#mmPortfolio
 * ISAPortfolio1Choice.mmPortfolio}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}</li>
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
 * "ISAPortfolio1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice to provide additional portfolio information or individual savings account information (UK government scheme provided by UK based financial institutions only)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ISAPortfolio1Choice", propOrder = {"ISA", "portfolio"})
public class ISAPortfolio1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ISAYearsOfIssue4 iSA;
	/**
	 * UK government schemes to encourage individuals to invest in securities
	 * based unit and investment trusts, offering certain tax benefits. These
	 * are not investment in their own right but are tax exempt wrappers in
	 * which individuals can hold equities, bonds and funds to shelter them from
	 * income and capital gains tax. <br>
	 * The Individual Savings Account (ISA) is provided only by UK based
	 * financial institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4
	 * ISAYearsOfIssue4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmTransfer
	 * Portfolio.mmTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ISAPortfolio1Choice
	 * ISAPortfolio1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \r\nThe Individual Savings Account (ISA) is provided only by UK based financial institutions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmISA = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Portfolio.mmTransfer;
			componentContext_lazy = () -> ISAPortfolio1Choice.mmObject();
			isDerived = false;
			xmlTag = "ISA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISA";
			definition = "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \r\nThe Individual Savings Account (ISA) is provided only by UK based financial institutions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ISAYearsOfIssue4.mmObject();
		}
	};
	protected Portfolio1 portfolio;
	/**
	 * Wrapper for a specific product or a specific sub-product owned by a set
	 * of beneficial owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Portfolio1 Portfolio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ISAPortfolio1Choice
	 * ISAPortfolio1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wrapper for a specific product or a specific sub-product owned by a set of beneficial owners."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPortfolio = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Portfolio.mmObject();
			componentContext_lazy = () -> ISAPortfolio1Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "Wrapper for a specific product or a specific sub-product owned by a set of beneficial owners.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Portfolio1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ISAPortfolio1Choice.mmISA, ISAPortfolio1Choice.mmPortfolio);
				trace_lazy = () -> Portfolio.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISAPortfolio1Choice";
				definition = "Choice to provide additional portfolio information or individual savings account information (UK government scheme provided by UK based financial institutions only).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ISA", required = true)
	public ISAYearsOfIssue4 getISA() {
		return iSA;
	}

	public void setISA(ISAYearsOfIssue4 iSA) {
		this.iSA = iSA;
	}

	@XmlElement(name = "Prtfl", required = true)
	public Portfolio1 getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio1 portfolio) {
		this.portfolio = portfolio;
	}
}