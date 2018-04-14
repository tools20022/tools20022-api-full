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
import com.tools20022.repository.choice.ClearingScheme1Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max40Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount24;
import com.tools20022.repository.msg.FinancialInstitutionIdentification9;
import com.tools20022.repository.msg.GuaranteeFunds1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Clearing circuits information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClearingCircuit
 * ClearingCircuits1.mmClearingCircuit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClaimLimitIndicator
 * ClearingCircuits1.mmClaimLimitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClearingSchemeShortName
 * ClearingCircuits1.mmClearingSchemeShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClearingSchemeLongName
 * ClearingCircuits1.mmClearingSchemeLongName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmAllOrNothingIndicator
 * ClearingCircuits1.mmAllOrNothingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmGuaranteeFunds
 * ClearingCircuits1.mmGuaranteeFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClearingAccount
 * ClearingCircuits1.mmClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1#mmClearingAccountOwner
 * ClearingCircuits1.mmClearingAccountOwner}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingCircuits1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Clearing circuits information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClearingCircuits1", propOrder = {"clearingCircuit", "claimLimitIndicator", "clearingSchemeShortName", "clearingSchemeLongName", "allOrNothingIndicator", "guaranteeFunds", "clearingAccount", "clearingAccountOwner"})
public class ClearingCircuits1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClrCrct", required = true)
	protected ClearingScheme1Choice clearingCircuit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClearingScheme1Choice
	 * ClearingScheme1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrCrct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingCircuit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing scheme used."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClearingCircuits1, ClearingScheme1Choice> mmClearingCircuit = new MMMessageAssociationEnd<ClearingCircuits1, ClearingScheme1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClrCrct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingCircuit";
			definition = "Clearing scheme used.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ClearingScheme1Choice.mmObject();
		}

		@Override
		public ClearingScheme1Choice getValue(ClearingCircuits1 obj) {
			return obj.getClearingCircuit();
		}

		@Override
		public void setValue(ClearingCircuits1 obj, ClearingScheme1Choice value) {
			obj.setClearingCircuit(value);
		}
	};
	@XmlElement(name = "ClmLmtInd", required = true)
	protected YesNoIndicator claimLimitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClmLmtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClaimLimitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the limits can be set for the external payment system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingCircuits1, YesNoIndicator> mmClaimLimitIndicator = new MMMessageAttribute<ClearingCircuits1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClmLmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClaimLimitIndicator";
			definition = "Indicates whether the limits can be set for the external payment system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ClearingCircuits1 obj) {
			return obj.getClaimLimitIndicator();
		}

		@Override
		public void setValue(ClearingCircuits1 obj, YesNoIndicator value) {
			obj.setClaimLimitIndicator(value);
		}
	};
	@XmlElement(name = "ClrSchmeShrtNm", required = true)
	protected Max40Text clearingSchemeShortName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSchmeShrtNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSchemeShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short name of the clearing scheme."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingCircuits1, Max40Text> mmClearingSchemeShortName = new MMMessageAttribute<ClearingCircuits1, Max40Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClrSchmeShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSchemeShortName";
			definition = "Short name of the clearing scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}

		@Override
		public Max40Text getValue(ClearingCircuits1 obj) {
			return obj.getClearingSchemeShortName();
		}

		@Override
		public void setValue(ClearingCircuits1 obj, Max40Text value) {
			obj.setClearingSchemeShortName(value);
		}
	};
	@XmlElement(name = "ClrSchmeLngNm", required = true)
	protected Max140Text clearingSchemeLongName;
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
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSchmeLngNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSchemeLongName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Long name of the clearing scheme."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingCircuits1, Max140Text> mmClearingSchemeLongName = new MMMessageAttribute<ClearingCircuits1, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClrSchmeLngNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSchemeLongName";
			definition = "Long name of the clearing scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(ClearingCircuits1 obj) {
			return obj.getClearingSchemeLongName();
		}

		@Override
		public void setValue(ClearingCircuits1 obj, Max140Text value) {
			obj.setClearingSchemeLongName(value);
		}
	};
	@XmlElement(name = "AllOrNthgInd", required = true)
	protected YesNoIndicator allOrNothingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllOrNthgInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNothingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether all or nothing rule is in effect."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClearingCircuits1, YesNoIndicator> mmAllOrNothingIndicator = new MMMessageAttribute<ClearingCircuits1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "AllOrNthgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNothingIndicator";
			definition = "Indicates whether all or nothing rule is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ClearingCircuits1 obj) {
			return obj.getAllOrNothingIndicator();
		}

		@Override
		public void setValue(ClearingCircuits1 obj, YesNoIndicator value) {
			obj.setAllOrNothingIndicator(value);
		}
	};
	@XmlElement(name = "GrntFnds", required = true)
	protected GuaranteeFunds1 guaranteeFunds;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GuaranteeFunds1
	 * GuaranteeFunds1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntFnds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Guarantee funds details."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClearingCircuits1, GuaranteeFunds1> mmGuaranteeFunds = new MMMessageAssociationEnd<ClearingCircuits1, GuaranteeFunds1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "GrntFnds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeFunds";
			definition = "Guarantee funds details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GuaranteeFunds1.mmObject();
		}

		@Override
		public GuaranteeFunds1 getValue(ClearingCircuits1 obj) {
			return obj.getGuaranteeFunds();
		}

		@Override
		public void setValue(ClearingCircuits1 obj, GuaranteeFunds1 value) {
			obj.setGuaranteeFunds(value);
		}
	};
	@XmlElement(name = "ClrAcct", required = true)
	protected CashAccount24 clearingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing account identifier."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClearingCircuits1, CashAccount24> mmClearingAccount = new MMMessageAssociationEnd<ClearingCircuits1, CashAccount24>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAccount";
			definition = "Clearing account identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public CashAccount24 getValue(ClearingCircuits1 obj) {
			return obj.getClearingAccount();
		}

		@Override
		public void setValue(ClearingCircuits1 obj, CashAccount24 value) {
			obj.setClearingAccount(value);
		}
	};
	@XmlElement(name = "ClrAcctOwnr", required = true)
	protected FinancialInstitutionIdentification9 clearingAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9
	 * FinancialInstitutionIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClearingCircuits1
	 * ClearingCircuits1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the clearing account owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ClearingCircuits1, FinancialInstitutionIdentification9> mmClearingAccountOwner = new MMMessageAssociationEnd<ClearingCircuits1, FinancialInstitutionIdentification9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ClearingCircuits1.mmObject();
			isDerived = false;
			xmlTag = "ClrAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAccountOwner";
			definition = "Identification of the clearing account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstitutionIdentification9.mmObject();
		}

		@Override
		public FinancialInstitutionIdentification9 getValue(ClearingCircuits1 obj) {
			return obj.getClearingAccountOwner();
		}

		@Override
		public void setValue(ClearingCircuits1 obj, FinancialInstitutionIdentification9 value) {
			obj.setClearingAccountOwner(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClearingCircuits1.mmClearingCircuit, com.tools20022.repository.msg.ClearingCircuits1.mmClaimLimitIndicator,
						com.tools20022.repository.msg.ClearingCircuits1.mmClearingSchemeShortName, com.tools20022.repository.msg.ClearingCircuits1.mmClearingSchemeLongName,
						com.tools20022.repository.msg.ClearingCircuits1.mmAllOrNothingIndicator, com.tools20022.repository.msg.ClearingCircuits1.mmGuaranteeFunds, com.tools20022.repository.msg.ClearingCircuits1.mmClearingAccount,
						com.tools20022.repository.msg.ClearingCircuits1.mmClearingAccountOwner);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClearingCircuits1";
				definition = "Clearing circuits information.";
			}
		});
		return mmObject_lazy.get();
	}

	public ClearingScheme1Choice getClearingCircuit() {
		return clearingCircuit;
	}

	public ClearingCircuits1 setClearingCircuit(ClearingScheme1Choice clearingCircuit) {
		this.clearingCircuit = Objects.requireNonNull(clearingCircuit);
		return this;
	}

	public YesNoIndicator getClaimLimitIndicator() {
		return claimLimitIndicator;
	}

	public ClearingCircuits1 setClaimLimitIndicator(YesNoIndicator claimLimitIndicator) {
		this.claimLimitIndicator = Objects.requireNonNull(claimLimitIndicator);
		return this;
	}

	public Max40Text getClearingSchemeShortName() {
		return clearingSchemeShortName;
	}

	public ClearingCircuits1 setClearingSchemeShortName(Max40Text clearingSchemeShortName) {
		this.clearingSchemeShortName = Objects.requireNonNull(clearingSchemeShortName);
		return this;
	}

	public Max140Text getClearingSchemeLongName() {
		return clearingSchemeLongName;
	}

	public ClearingCircuits1 setClearingSchemeLongName(Max140Text clearingSchemeLongName) {
		this.clearingSchemeLongName = Objects.requireNonNull(clearingSchemeLongName);
		return this;
	}

	public YesNoIndicator getAllOrNothingIndicator() {
		return allOrNothingIndicator;
	}

	public ClearingCircuits1 setAllOrNothingIndicator(YesNoIndicator allOrNothingIndicator) {
		this.allOrNothingIndicator = Objects.requireNonNull(allOrNothingIndicator);
		return this;
	}

	public GuaranteeFunds1 getGuaranteeFunds() {
		return guaranteeFunds;
	}

	public ClearingCircuits1 setGuaranteeFunds(GuaranteeFunds1 guaranteeFunds) {
		this.guaranteeFunds = Objects.requireNonNull(guaranteeFunds);
		return this;
	}

	public CashAccount24 getClearingAccount() {
		return clearingAccount;
	}

	public ClearingCircuits1 setClearingAccount(CashAccount24 clearingAccount) {
		this.clearingAccount = Objects.requireNonNull(clearingAccount);
		return this;
	}

	public FinancialInstitutionIdentification9 getClearingAccountOwner() {
		return clearingAccountOwner;
	}

	public ClearingCircuits1 setClearingAccountOwner(FinancialInstitutionIdentification9 clearingAccountOwner) {
		this.clearingAccountOwner = Objects.requireNonNull(clearingAccountOwner);
		return this;
	}
}