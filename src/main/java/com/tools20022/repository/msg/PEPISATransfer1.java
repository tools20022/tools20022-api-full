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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.PreviousYearChoice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrument7;
import com.tools20022.repository.msg.ISAYearsOfIssue;
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
 * Describes the type of account and the assets to be transferred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#PepOrIsaRule
 * PEPISATransfer1.PepOrIsaRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer1#mmTransferIdentification
 * PEPISATransfer1.mmTransferIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#mmISA
 * PEPISATransfer1.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#mmPEP
 * PEPISATransfer1.mmPEP}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#mmAssets
 * PEPISATransfer1.mmAssets}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PEPISATransfer1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of account and the assets to be transferred."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PEPISATransfer1", propOrder = {"transferIdentification", "iSA", "pEP", "assets"})
public class PEPISATransfer1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrfId", required = true)
	protected Max35Text transferIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer1
	 * PEPISATransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the new plan manager to each transfer of asset."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PEPISATransfer1, Max35Text> mmTransferIdentification = new MMMessageAttribute<PEPISATransfer1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISATransfer1.mmObject();
			isDerived = false;
			xmlTag = "TrfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIdentification";
			definition = "Identification assigned by the new plan manager to each transfer of asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PEPISATransfer1 obj) {
			return obj.getTransferIdentification();
		}

		@Override
		public void setValue(PEPISATransfer1 obj, Max35Text value) {
			obj.setTransferIdentification(value);
		}
	};
	@XmlElement(name = "ISA", required = true)
	protected ISAYearsOfIssue iSA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue
	 * ISAYearsOfIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer1
	 * PEPISATransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \nThe Personal Equity Plan (PEP) and the Individual Savings Account (ISA) are provided only by UK based financial institutions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PEPISATransfer1, ISAYearsOfIssue> mmISA = new MMMessageAssociationEnd<PEPISATransfer1, ISAYearsOfIssue>() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISATransfer1.mmObject();
			isDerived = false;
			xmlTag = "ISA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISA";
			definition = "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \nThe Personal Equity Plan (PEP) and the Individual Savings Account (ISA) are provided only by UK based financial institutions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ISAYearsOfIssue.mmObject();
		}

		@Override
		public ISAYearsOfIssue getValue(PEPISATransfer1 obj) {
			return obj.getISA();
		}

		@Override
		public void setValue(PEPISATransfer1 obj, ISAYearsOfIssue value) {
			obj.setISA(value);
		}
	};
	@XmlElement(name = "PEP", required = true)
	protected PreviousYearChoice pEP;
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer1
	 * PEPISATransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PEP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \nThe Personal Equity Plan (PEP) and the Individual Savings Account (ISA) are provided only by UK based financial institutions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PEPISATransfer1, PreviousYearChoice> mmPEP = new MMMessageAssociationEnd<PEPISATransfer1, PreviousYearChoice>() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISATransfer1.mmObject();
			isDerived = false;
			xmlTag = "PEP";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PEP";
			definition = "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \nThe Personal Equity Plan (PEP) and the Individual Savings Account (ISA) are provided only by UK based financial institutions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PreviousYearChoice.mmObject();
		}

		@Override
		public PreviousYearChoice getValue(PEPISATransfer1 obj) {
			return obj.getPEP();
		}

		@Override
		public void setValue(PEPISATransfer1 obj, PreviousYearChoice value) {
			obj.setPEP(value);
		}
	};
	@XmlElement(name = "Assts")
	protected List<FinancialInstrument7> assets;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument7
	 * FinancialInstrument7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer1
	 * PEPISATransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying assets for the PEP or ISA."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PEPISATransfer1, List<FinancialInstrument7>> mmAssets = new MMMessageAssociationEnd<PEPISATransfer1, List<FinancialInstrument7>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PEPISATransfer1.mmObject();
			isDerived = false;
			xmlTag = "Assts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assets";
			definition = "Specifies the underlying assets for the PEP or ISA.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument7.mmObject();
		}

		@Override
		public List<FinancialInstrument7> getValue(PEPISATransfer1 obj) {
			return obj.getAssets();
		}

		@Override
		public void setValue(PEPISATransfer1 obj, List<FinancialInstrument7> value) {
			obj.setAssets(value);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer1
	 * PEPISATransfer1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#mmISA
	 * PEPISATransfer1.mmISA}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#mmPEP
	 * PEPISATransfer1.mmPEP}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PepOrIsaRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor PepOrIsaRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PepOrIsaRule";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PEPISATransfer1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer1.mmISA, com.tools20022.repository.msg.PEPISATransfer1.mmPEP);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer1.mmTransferIdentification, com.tools20022.repository.msg.PEPISATransfer1.mmISA, com.tools20022.repository.msg.PEPISATransfer1.mmPEP,
						com.tools20022.repository.msg.PEPISATransfer1.mmAssets);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PEPISATransfer1";
				definition = "Describes the type of account and the assets to be transferred.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer1.PepOrIsaRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransferIdentification() {
		return transferIdentification;
	}

	public PEPISATransfer1 setTransferIdentification(Max35Text transferIdentification) {
		this.transferIdentification = Objects.requireNonNull(transferIdentification);
		return this;
	}

	public ISAYearsOfIssue getISA() {
		return iSA;
	}

	public PEPISATransfer1 setISA(ISAYearsOfIssue iSA) {
		this.iSA = Objects.requireNonNull(iSA);
		return this;
	}

	public PreviousYearChoice getPEP() {
		return pEP;
	}

	public PEPISATransfer1 setPEP(PreviousYearChoice pEP) {
		this.pEP = Objects.requireNonNull(pEP);
		return this;
	}

	public List<FinancialInstrument7> getAssets() {
		return assets == null ? assets = new ArrayList<>() : assets;
	}

	public PEPISATransfer1 setAssets(List<FinancialInstrument7> assets) {
		this.assets = Objects.requireNonNull(assets);
		return this;
	}
}