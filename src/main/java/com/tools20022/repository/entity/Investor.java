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
import com.tools20022.repository.choice.DeMinimus1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentAccountPartyRole;
import com.tools20022.repository.msg.DeMinimusApplicable1;
import com.tools20022.repository.msg.DeMinimusNotApplicable1;
import com.tools20022.repository.msg.NewIssueAllocation1;
import com.tools20022.repository.msg.NewIssueAllocation2;
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
 * <li>{@linkplain com.tools20022.repository.entity.Investor#NewIssuePermission
 * Investor.NewIssuePermission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Investor#DeMinimusApplicable
 * Investor.DeMinimusApplicable}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Investor#Restricted
 * Investor.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Investor#RestrictedPersonReason
 * Investor.RestrictedPersonReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#DeMinimusNotApplicable
 * NewIssueAllocation1.DeMinimusNotApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#InvestmentDecisionPerson
 * SecuritiesTransactionReport4.InvestmentDecisionPerson}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DeMinimusApplicable1#NewIssuePermission
	 * DeMinimusApplicable1.NewIssuePermission}</li>
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
	public static final MMBusinessAttribute NewIssuePermission = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeMinimusApplicable1.NewIssuePermission);
			elementContext_lazy = () -> Investor.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewIssuePermission";
			definition = "Indicates whether the investor permits its beneficial owners to participate in profits and losses attributed to new issue securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#DeMinimusApplicable
	 * NewIssueAllocation1.DeMinimusApplicable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeMinimus1Choice#DeMinimusApplicable
	 * DeMinimus1Choice.DeMinimusApplicable}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DeMinimus1Choice#DeMinimusNotApplicable
	 * DeMinimus1Choice.DeMinimusNotApplicable}</li>
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
	public static final MMBusinessAttribute DeMinimusApplicable = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NewIssueAllocation1.DeMinimusApplicable, com.tools20022.repository.choice.DeMinimus1Choice.DeMinimusApplicable,
					com.tools20022.repository.choice.DeMinimus1Choice.DeMinimusNotApplicable);
			elementContext_lazy = () -> Investor.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeMinimusApplicable";
			definition = "Determine if the investor is covered by the \"de minimis\" exemption.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1#Restricted
	 * NewIssueAllocation1.Restricted}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2#Restricted
	 * NewIssueAllocation2.Restricted}</li>
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
	public static final MMBusinessAttribute Restricted = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NewIssueAllocation1.Restricted, com.tools20022.repository.msg.NewIssueAllocation2.Restricted);
			elementContext_lazy = () -> Investor.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Indicates whether the investor is eligible to participate in the profits and losses from a new issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.DeMinimusNotApplicable1#RestrictedPersonReason
	 * DeMinimusNotApplicable1.RestrictedPersonReason}</li>
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
	public static final MMBusinessAttribute RestrictedPersonReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeMinimusNotApplicable1.RestrictedPersonReason);
			elementContext_lazy = () -> Investor.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RestrictedPersonReason";
			definition = "Reason for the restricted person.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Investor";
				definition = "Party which makes investment decisions in relation with its investment account.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NewIssueAllocation1.DeMinimusNotApplicable, com.tools20022.repository.msg.SecuritiesTransactionReport4.InvestmentDecisionPerson);
				superType_lazy = () -> InvestmentAccountPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Investor.NewIssuePermission, com.tools20022.repository.entity.Investor.DeMinimusApplicable, com.tools20022.repository.entity.Investor.Restricted,
						com.tools20022.repository.entity.Investor.RestrictedPersonReason);
				derivationComponent_lazy = () -> Arrays.asList(DeMinimusApplicable1.mmObject(), DeMinimusNotApplicable1.mmObject(), NewIssueAllocation1.mmObject(), NewIssueAllocation2.mmObject(), DeMinimus1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}