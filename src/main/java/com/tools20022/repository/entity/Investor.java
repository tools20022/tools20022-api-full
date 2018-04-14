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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DeMinimus1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentAccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Party which makes investment decisions in relation with its investment
 * account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Investor" src="doc-files/Investor.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Investor#mmNewIssuePermission
 * Investor.mmNewIssuePermission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Investor#mmDeMinimusApplicable
 * Investor.mmDeMinimusApplicable}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Investor#mmRestricted
 * Investor.mmRestricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Investor#mmRestrictedPersonReason
 * Investor.mmRestrictedPersonReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#mmDeMinimusNotApplicable
 * NewIssueAllocation1.mmDeMinimusNotApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmInvestmentDecisionPerson
 * SecuritiesTransactionReport4.mmInvestmentDecisionPerson}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DeMinimusApplicable1
 * DeMinimusApplicable1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeMinimusNotApplicable1
 * DeMinimusNotApplicable1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NewIssueAllocation1
 * NewIssueAllocation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NewIssueAllocation2
 * NewIssueAllocation2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DeMinimus1Choice
 * DeMinimus1Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Investor"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party which makes investment decisions in relation with its investment account."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Investor extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator newIssuePermission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeMinimusApplicable1#mmNewIssuePermission
	 * DeMinimusApplicable1.mmNewIssuePermission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Investor
	 * Investor}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssuePermission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor permits its beneficial owners to participate in profits and losses attributed to new issue securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Investor, YesNoIndicator> mmNewIssuePermission = new MMBusinessAttribute<Investor, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(DeMinimusApplicable1.mmNewIssuePermission);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Investor.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewIssuePermission";
			definition = "Indicates whether the investor permits its beneficial owners to participate in profits and losses attributed to new issue securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Investor obj) {
			return obj.getNewIssuePermission();
		}

		@Override
		public void setValue(Investor obj, YesNoIndicator value) {
			obj.setNewIssuePermission(value);
		}
	};
	protected Max35Text deMinimusApplicable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#mmDeMinimusApplicable
	 * NewIssueAllocation1.mmDeMinimusApplicable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeMinimus1Choice#mmDeMinimusApplicable
	 * DeMinimus1Choice.mmDeMinimusApplicable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeMinimus1Choice#mmDeMinimusNotApplicable
	 * DeMinimus1Choice.mmDeMinimusNotApplicable}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Investor
	 * Investor}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeMinimusApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Determine if the investor is covered by the \"de minimis\" exemption."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Investor, Max35Text> mmDeMinimusApplicable = new MMBusinessAttribute<Investor, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(NewIssueAllocation1.mmDeMinimusApplicable, DeMinimus1Choice.mmDeMinimusApplicable, DeMinimus1Choice.mmDeMinimusNotApplicable);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Investor.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeMinimusApplicable";
			definition = "Determine if the investor is covered by the \"de minimis\" exemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Investor obj) {
			return obj.getDeMinimusApplicable();
		}

		@Override
		public void setValue(Investor obj, Max35Text value) {
			obj.setDeMinimusApplicable(value);
		}
	};
	protected YesNoIndicator restricted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#mmRestricted
	 * NewIssueAllocation1.mmRestricted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2#mmRestricted
	 * NewIssueAllocation2.mmRestricted}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Investor
	 * Investor}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor is eligible to participate in the profits and losses from a new issue."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Investor, YesNoIndicator> mmRestricted = new MMBusinessAttribute<Investor, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(NewIssueAllocation1.mmRestricted, NewIssueAllocation2.mmRestricted);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Investor.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Indicates whether the investor is eligible to participate in the profits and losses from a new issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Investor obj) {
			return obj.getRestricted();
		}

		@Override
		public void setValue(Investor obj, YesNoIndicator value) {
			obj.setRestricted(value);
		}
	};
	protected Max350Text restrictedPersonReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeMinimusNotApplicable1#mmRestrictedPersonReason
	 * DeMinimusNotApplicable1.mmRestrictedPersonReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Investor
	 * Investor}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedPersonReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the restricted person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Investor, Max350Text> mmRestrictedPersonReason = new MMBusinessAttribute<Investor, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(DeMinimusNotApplicable1.mmRestrictedPersonReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Investor.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestrictedPersonReason";
			definition = "Reason for the restricted person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Investor obj) {
			return obj.getRestrictedPersonReason();
		}

		@Override
		public void setValue(Investor obj, Max350Text value) {
			obj.setRestrictedPersonReason(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Investor";
				definition = "Party which makes investment decisions in relation with its investment account.";
				derivationElement_lazy = () -> Arrays.asList(NewIssueAllocation1.mmDeMinimusNotApplicable, SecuritiesTransactionReport4.mmInvestmentDecisionPerson);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Investor.mmNewIssuePermission, com.tools20022.repository.entity.Investor.mmDeMinimusApplicable, com.tools20022.repository.entity.Investor.mmRestricted,
						com.tools20022.repository.entity.Investor.mmRestrictedPersonReason);
				derivationComponent_lazy = () -> Arrays.asList(DeMinimusApplicable1.mmObject(), DeMinimusNotApplicable1.mmObject(), NewIssueAllocation1.mmObject(), NewIssueAllocation2.mmObject(), DeMinimus1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Investor.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getNewIssuePermission() {
		return newIssuePermission;
	}

	public Investor setNewIssuePermission(YesNoIndicator newIssuePermission) {
		this.newIssuePermission = Objects.requireNonNull(newIssuePermission);
		return this;
	}

	public Max35Text getDeMinimusApplicable() {
		return deMinimusApplicable;
	}

	public Investor setDeMinimusApplicable(Max35Text deMinimusApplicable) {
		this.deMinimusApplicable = Objects.requireNonNull(deMinimusApplicable);
		return this;
	}

	public YesNoIndicator getRestricted() {
		return restricted;
	}

	public Investor setRestricted(YesNoIndicator restricted) {
		this.restricted = Objects.requireNonNull(restricted);
		return this;
	}

	public Max350Text getRestrictedPersonReason() {
		return restrictedPersonReason;
	}

	public Investor setRestrictedPersonReason(Max350Text restrictedPersonReason) {
		this.restrictedPersonReason = Objects.requireNonNull(restrictedPersonReason);
		return this;
	}
}