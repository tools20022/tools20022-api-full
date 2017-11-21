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
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Investor"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party which makes investment decisions in relation with its investment account."
 * </li>
 * </ul>
 */
public class Investor extends InvestmentAccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator newIssuePermission;
	/**
	 * Indicates whether the investor permits its beneficial owners to
	 * participate in profits and losses attributed to new issue securities.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssuePermission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor permits its beneficial owners to participate in profits and losses attributed to new issue securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNewIssuePermission = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DeMinimusApplicable1.mmNewIssuePermission);
			elementContext_lazy = () -> com.tools20022.repository.entity.Investor.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewIssuePermission";
			definition = "Indicates whether the investor permits its beneficial owners to participate in profits and losses attributed to new issue securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Investor.class.getMethod("getNewIssuePermission", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text deMinimusApplicable;
	/**
	 * Determine if the investor is covered by the "de minimis" exemption.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeMinimusApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Determine if the investor is covered by the \"de minimis\" exemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeMinimusApplicable = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(NewIssueAllocation1.mmDeMinimusApplicable, DeMinimus1Choice.mmDeMinimusApplicable, DeMinimus1Choice.mmDeMinimusNotApplicable);
			elementContext_lazy = () -> com.tools20022.repository.entity.Investor.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeMinimusApplicable";
			definition = "Determine if the investor is covered by the \"de minimis\" exemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Investor.class.getMethod("getDeMinimusApplicable", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator restricted;
	/**
	 * Indicates whether the investor is eligible to participate in the profits
	 * and losses from a new issue.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor is eligible to participate in the profits and losses from a new issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRestricted = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(NewIssueAllocation1.mmRestricted, NewIssueAllocation2.mmRestricted);
			elementContext_lazy = () -> com.tools20022.repository.entity.Investor.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Indicates whether the investor is eligible to participate in the profits and losses from a new issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Investor.class.getMethod("getRestricted", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text restrictedPersonReason;
	/**
	 * Reason for the restricted person.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedPersonReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the restricted person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRestrictedPersonReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DeMinimusNotApplicable1.mmRestrictedPersonReason);
			elementContext_lazy = () -> com.tools20022.repository.entity.Investor.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestrictedPersonReason";
			definition = "Reason for the restricted person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Investor.class.getMethod("getRestrictedPersonReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	public void setNewIssuePermission(YesNoIndicator newIssuePermission) {
		this.newIssuePermission = newIssuePermission;
	}

	public Max35Text getDeMinimusApplicable() {
		return deMinimusApplicable;
	}

	public void setDeMinimusApplicable(Max35Text deMinimusApplicable) {
		this.deMinimusApplicable = deMinimusApplicable;
	}

	public YesNoIndicator getRestricted() {
		return restricted;
	}

	public void setRestricted(YesNoIndicator restricted) {
		this.restricted = restricted;
	}

	public Max350Text getRestrictedPersonReason() {
		return restrictedPersonReason;
	}

	public void setRestrictedPersonReason(Max350Text restrictedPersonReason) {
		this.restrictedPersonReason = restrictedPersonReason;
	}
}