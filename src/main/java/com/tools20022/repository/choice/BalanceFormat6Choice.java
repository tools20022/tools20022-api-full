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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedQuantityFormat6;
import com.tools20022.repository.msg.SignedQuantityFormat7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between balance, eligible balance and not eligible balance formats.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmBalance
 * BalanceFormat6Choice.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmEligibleBalance
 * BalanceFormat6Choice.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmNotEligibleBalance
 * BalanceFormat6Choice.mmNotEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmFullPeriodUnits
 * BalanceFormat6Choice.mmFullPeriodUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice#mmPartWayPeriodUnits
 * BalanceFormat6Choice.mmPartWayPeriodUnits}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
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
 * "BalanceFormat6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between balance, eligible balance and not eligible balance formats."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice
 * BalanceFormat3Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BalanceFormat6Choice", propOrder = {"balance", "eligibleBalance", "notEligibleBalance", "fullPeriodUnits", "partWayPeriodUnits"})
public class BalanceFormat6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Bal", required = true)
	protected SignedQuantityFormat7 balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat7
	 * SignedQuantityFormat7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about balance related to a corporate action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmBalance
	 * BalanceFormat3Choice.mmBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BalanceFormat6Choice, SignedQuantityFormat7> mmBalance = new MMMessageAssociationEnd<BalanceFormat6Choice, SignedQuantityFormat7>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.BalanceFormat6Choice.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Provides information about balance related to a corporate action.";
			previousVersion_lazy = () -> BalanceFormat3Choice.mmBalance;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat7.mmObject();
		}

		@Override
		public SignedQuantityFormat7 getValue(BalanceFormat6Choice obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(BalanceFormat6Choice obj, SignedQuantityFormat7 value) {
			obj.setBalance(value);
		}
	};
	@XmlElement(name = "ElgblBal", required = true)
	protected SignedQuantityFormat6 eligibleBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide eligible balance information in different formats."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmEligibleBalance
	 * BalanceFormat3Choice.mmEligibleBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BalanceFormat6Choice, SignedQuantityFormat6> mmEligibleBalance = new MMMessageAssociationEnd<BalanceFormat6Choice, SignedQuantityFormat6>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.BalanceFormat6Choice.mmObject();
			isDerived = false;
			xmlTag = "ElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleBalance";
			definition = "Provide eligible balance information in different formats.";
			previousVersion_lazy = () -> BalanceFormat3Choice.mmEligibleBalance;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public SignedQuantityFormat6 getValue(BalanceFormat6Choice obj) {
			return obj.getEligibleBalance();
		}

		@Override
		public void setValue(BalanceFormat6Choice obj, SignedQuantityFormat6 value) {
			obj.setEligibleBalance(value);
		}
	};
	@XmlElement(name = "NotElgblBal", required = true)
	protected SignedQuantityFormat6 notEligibleBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotElgblBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide not eligible balance information in different formats."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmNotEligibleBalance
	 * BalanceFormat3Choice.mmNotEligibleBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BalanceFormat6Choice, SignedQuantityFormat6> mmNotEligibleBalance = new MMMessageAssociationEnd<BalanceFormat6Choice, SignedQuantityFormat6>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.BalanceFormat6Choice.mmObject();
			isDerived = false;
			xmlTag = "NotElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEligibleBalance";
			definition = "Provide not eligible balance information in different formats.";
			previousVersion_lazy = () -> BalanceFormat3Choice.mmNotEligibleBalance;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public SignedQuantityFormat6 getValue(BalanceFormat6Choice obj) {
			return obj.getNotEligibleBalance();
		}

		@Override
		public void setValue(BalanceFormat6Choice obj, SignedQuantityFormat6 value) {
			obj.setNotEligibleBalance(value);
		}
	};
	@XmlElement(name = "FullPrdUnits", required = true)
	protected SignedQuantityFormat6 fullPeriodUnits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullPrdUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPeriodUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units of a fund that were purchased in a previous distribution period and/or held at the beginning of a distribution period, for example Group I Units in the UK."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmFullPeriodUnits
	 * BalanceFormat3Choice.mmFullPeriodUnits}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceFormat6Choice, SignedQuantityFormat6> mmFullPeriodUnits = new MMMessageAttribute<BalanceFormat6Choice, SignedQuantityFormat6>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.BalanceFormat6Choice.mmObject();
			isDerived = false;
			xmlTag = "FullPrdUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPeriodUnits";
			definition = "Number of units of a fund that were purchased in a previous distribution period and/or held at the beginning of a distribution period, for example Group I Units in the UK.";
			previousVersion_lazy = () -> BalanceFormat3Choice.mmFullPeriodUnits;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public SignedQuantityFormat6 getValue(BalanceFormat6Choice obj) {
			return obj.getFullPeriodUnits();
		}

		@Override
		public void setValue(BalanceFormat6Choice obj, SignedQuantityFormat6 value) {
			obj.setFullPeriodUnits(value);
		}
	};
	@XmlElement(name = "PartWayPrdUnits", required = true)
	protected SignedQuantityFormat6 partWayPeriodUnits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat6Choice
	 * BalanceFormat6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PartWayPrdUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartWayPeriodUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units of a fund that were purchased part way throughout a distribution period, for example Group II Units in the U.K."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat3Choice#mmPartWayPeriodUnits
	 * BalanceFormat3Choice.mmPartWayPeriodUnits}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceFormat6Choice, SignedQuantityFormat6> mmPartWayPeriodUnits = new MMMessageAttribute<BalanceFormat6Choice, SignedQuantityFormat6>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.BalanceFormat6Choice.mmObject();
			isDerived = false;
			xmlTag = "PartWayPrdUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartWayPeriodUnits";
			definition = "Number of units of a fund that were purchased part way throughout a distribution period, for example Group II Units in the U.K.";
			previousVersion_lazy = () -> BalanceFormat3Choice.mmPartWayPeriodUnits;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public SignedQuantityFormat6 getValue(BalanceFormat6Choice obj) {
			return obj.getPartWayPeriodUnits();
		}

		@Override
		public void setValue(BalanceFormat6Choice obj, SignedQuantityFormat6 value) {
			obj.setPartWayPeriodUnits(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BalanceFormat6Choice.mmBalance, com.tools20022.repository.choice.BalanceFormat6Choice.mmEligibleBalance,
						com.tools20022.repository.choice.BalanceFormat6Choice.mmNotEligibleBalance, com.tools20022.repository.choice.BalanceFormat6Choice.mmFullPeriodUnits,
						com.tools20022.repository.choice.BalanceFormat6Choice.mmPartWayPeriodUnits);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceFormat6Choice";
				definition = "Choice between balance, eligible balance and not eligible balance formats.";
				previousVersion_lazy = () -> BalanceFormat3Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SignedQuantityFormat7 getBalance() {
		return balance;
	}

	public BalanceFormat6Choice setBalance(SignedQuantityFormat7 balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public SignedQuantityFormat6 getEligibleBalance() {
		return eligibleBalance;
	}

	public BalanceFormat6Choice setEligibleBalance(SignedQuantityFormat6 eligibleBalance) {
		this.eligibleBalance = Objects.requireNonNull(eligibleBalance);
		return this;
	}

	public SignedQuantityFormat6 getNotEligibleBalance() {
		return notEligibleBalance;
	}

	public BalanceFormat6Choice setNotEligibleBalance(SignedQuantityFormat6 notEligibleBalance) {
		this.notEligibleBalance = Objects.requireNonNull(notEligibleBalance);
		return this;
	}

	public SignedQuantityFormat6 getFullPeriodUnits() {
		return fullPeriodUnits;
	}

	public BalanceFormat6Choice setFullPeriodUnits(SignedQuantityFormat6 fullPeriodUnits) {
		this.fullPeriodUnits = Objects.requireNonNull(fullPeriodUnits);
		return this;
	}

	public SignedQuantityFormat6 getPartWayPeriodUnits() {
		return partWayPeriodUnits;
	}

	public BalanceFormat6Choice setPartWayPeriodUnits(SignedQuantityFormat6 partWayPeriodUnits) {
		this.partWayPeriodUnits = Objects.requireNonNull(partWayPeriodUnits);
		return this;
	}
}