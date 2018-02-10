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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.ReportingService;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account and statement parameters for which a statement is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmAccountIdentification
 * StatementAttributes1.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmSubAccountIdentification
 * StatementAttributes1.mmSubAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmAccountOwner
 * StatementAttributes1.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmStatementType
 * StatementAttributes1.mmStatementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmStatementTerm
 * StatementAttributes1.mmStatementTerm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmFrequency
 * StatementAttributes1.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmUpdateType
 * StatementAttributes1.mmUpdateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#mmStatementBasis
 * StatementAttributes1.mmStatementBasis}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
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
 * "StatementAttributes1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account and statement parameters for which a statement is requested."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatementAttributes1", propOrder = {"accountIdentification", "subAccountIdentification", "accountOwner", "statementType", "statementTerm", "frequency", "updateType", "statementBasis"})
public class StatementAttributes1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId", required = true)
	protected AccountIdentificationFormatChoice accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice
	 * AccountIdentificationFormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1
	 * StatementAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementAttributes1.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentificationFormatChoice.mmObject();
		}
	};
	@XmlElement(name = "SubAcctId")
	protected AccountIdentificationFormatChoice subAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice
	 * AccountIdentificationFormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1
	 * StatementAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementAttributes1.mmObject();
			isDerived = false;
			xmlTag = "SubAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationFormatChoice.mmObject();
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification2Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1
	 * StatementAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwner = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementAttributes1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	@XmlElement(name = "StmtTp", required = true)
	protected StatementType1Choice statementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementType1Choice
	 * StatementType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1
	 * StatementAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifes the statement message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementAttributes1.mmObject();
			isDerived = false;
			xmlTag = "StmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementType";
			definition = "Specifes the statement message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StatementType1Choice.mmObject();
		}
	};
	@XmlElement(name = "StmtTerm")
	protected StatementTerm1Choice statementTerm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementTerm1Choice
	 * StatementTerm1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1
	 * StatementAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtTerm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementTerm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementTerm = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Account.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementAttributes1.mmObject();
			isDerived = false;
			xmlTag = "StmtTerm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementTerm";
			definition = "Date of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementTerm1Choice.mmObject();
		}
	};
	@XmlElement(name = "Frqcy")
	protected FrequencyCodeAndDSSCode1Choice frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FrequencyCodeAndDSSCode1Choice
	 * FrequencyCodeAndDSSCode1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1
	 * StatementAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementAttributes1.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FrequencyCodeAndDSSCode1Choice.mmObject();
		}
	};
	@XmlElement(name = "UpdTp")
	protected StatementUpdateTypeCodeAndDSSCodeChoice updateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice
	 * StatementUpdateTypeCodeAndDSSCodeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1
	 * StatementAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the report is complete or contains changes only."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUpdateType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementAttributes1.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the report is complete or contains changes only.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementUpdateTypeCodeAndDSSCodeChoice.mmObject();
		}
	};
	@XmlElement(name = "StmtBsis")
	protected StatementBasisCodeAndDSSCodeChoice statementBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementBasisCodeAndDSSCodeChoice
	 * StatementBasisCodeAndDSSCodeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1
	 * StatementAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of balance on which the statement is prepared."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementBasis = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementAttributes1.mmObject();
			isDerived = false;
			xmlTag = "StmtBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasis";
			definition = "Type of balance on which the statement is prepared.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementBasisCodeAndDSSCodeChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementAttributes1.mmAccountIdentification, com.tools20022.repository.msg.StatementAttributes1.mmSubAccountIdentification,
						com.tools20022.repository.msg.StatementAttributes1.mmAccountOwner, com.tools20022.repository.msg.StatementAttributes1.mmStatementType, com.tools20022.repository.msg.StatementAttributes1.mmStatementTerm,
						com.tools20022.repository.msg.StatementAttributes1.mmFrequency, com.tools20022.repository.msg.StatementAttributes1.mmUpdateType, com.tools20022.repository.msg.StatementAttributes1.mmStatementBasis);
				trace_lazy = () -> Account.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StatementAttributes1";
				definition = "Account and statement parameters for which a statement is requested.";
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentificationFormatChoice getAccountIdentification() {
		return accountIdentification;
	}

	public StatementAttributes1 setAccountIdentification(AccountIdentificationFormatChoice accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public Optional<AccountIdentificationFormatChoice> getSubAccountIdentification() {
		return subAccountIdentification == null ? Optional.empty() : Optional.of(subAccountIdentification);
	}

	public StatementAttributes1 setSubAccountIdentification(AccountIdentificationFormatChoice subAccountIdentification) {
		this.subAccountIdentification = subAccountIdentification;
		return this;
	}

	public Optional<PartyIdentification2Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public StatementAttributes1 setAccountOwner(PartyIdentification2Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public StatementType1Choice getStatementType() {
		return statementType;
	}

	public StatementAttributes1 setStatementType(StatementType1Choice statementType) {
		this.statementType = Objects.requireNonNull(statementType);
		return this;
	}

	public Optional<StatementTerm1Choice> getStatementTerm() {
		return statementTerm == null ? Optional.empty() : Optional.of(statementTerm);
	}

	public StatementAttributes1 setStatementTerm(StatementTerm1Choice statementTerm) {
		this.statementTerm = statementTerm;
		return this;
	}

	public Optional<FrequencyCodeAndDSSCode1Choice> getFrequency() {
		return frequency == null ? Optional.empty() : Optional.of(frequency);
	}

	public StatementAttributes1 setFrequency(FrequencyCodeAndDSSCode1Choice frequency) {
		this.frequency = frequency;
		return this;
	}

	public Optional<StatementUpdateTypeCodeAndDSSCodeChoice> getUpdateType() {
		return updateType == null ? Optional.empty() : Optional.of(updateType);
	}

	public StatementAttributes1 setUpdateType(StatementUpdateTypeCodeAndDSSCodeChoice updateType) {
		this.updateType = updateType;
		return this;
	}

	public Optional<StatementBasisCodeAndDSSCodeChoice> getStatementBasis() {
		return statementBasis == null ? Optional.empty() : Optional.of(statementBasis);
	}

	public StatementAttributes1 setStatementBasis(StatementBasisCodeAndDSSCodeChoice statementBasis) {
		this.statementBasis = statementBasis;
		return this;
	}
}