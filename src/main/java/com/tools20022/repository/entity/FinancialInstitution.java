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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.msg.BICIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organisation established primarily to provide financial services.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FinancialInstitution" src="doc-files/FinancialInstitution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemMember2#MemberIdentification
 * SystemMember2.MemberIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party7Choice#Agent
 * Party7Choice.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party12Choice#Agent
 * Party12Choice.Agent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5#IdentificationIssuer
 * DocumentIdentification5.IdentificationIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1#Submitter
 * DocumentIdentification1.Submitter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequiredSubmission1#Submitter
 * RequiredSubmission1.Submitter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#BuyerBank
 * Baseline2.BuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#SellerBank
 * Baseline2.SellerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation1#ObligorBank
 * PaymentObligation1.ObligorBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#RecipientBank
 * PaymentObligation1.RecipientBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequiredSubmission3#Submitter
 * RequiredSubmission3.Submitter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequiredSubmission4#Submitter
 * RequiredSubmission4.Submitter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequiredSubmission5#Submitter
 * RequiredSubmission5.Submitter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#BuyerBank
 * Baseline3.BuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#SellerBank
 * Baseline3.SellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification4#Submitter
 * DocumentIdentification4.Submitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification2#Submitter
 * DocumentIdentification2.Submitter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member2#ReturnAddress
 * Member2.ReturnAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#BuyerBank
 * Baseline4.BuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#SellerBank
 * Baseline4.SellerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentObligation2#ObligorBank
 * PaymentObligation2.ObligorBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#RecipientBank
 * PaymentObligation2.RecipientBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#BuyerBank
 * Baseline5.BuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#SellerBank
 * Baseline5.SellerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequiredSubmission6#Submitter
 * RequiredSubmission6.Submitter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer7#AcquiringInstitution
 * Acquirer7.AcquiringInstitution}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party28Choice#Agent
 * Party28Choice.Agent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BICIdentification1
 * BICIdentification1}</li>
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
 * "FinancialInstitution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organisation established primarily to provide financial services."</li>
 * </ul>
 */
public class FinancialInstitution extends Organisation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitution";
				definition = "Organisation established primarily to provide financial services.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemMember2.MemberIdentification, com.tools20022.repository.choice.Party7Choice.Agent, com.tools20022.repository.choice.Party12Choice.Agent,
						com.tools20022.repository.msg.DocumentIdentification5.IdentificationIssuer, com.tools20022.repository.msg.DocumentIdentification1.Submitter, com.tools20022.repository.msg.RequiredSubmission1.Submitter,
						com.tools20022.repository.msg.Baseline2.BuyerBank, com.tools20022.repository.msg.Baseline2.SellerBank, com.tools20022.repository.msg.PaymentObligation1.ObligorBank,
						com.tools20022.repository.msg.PaymentObligation1.RecipientBank, com.tools20022.repository.msg.RequiredSubmission3.Submitter, com.tools20022.repository.msg.RequiredSubmission4.Submitter,
						com.tools20022.repository.msg.RequiredSubmission5.Submitter, com.tools20022.repository.msg.Baseline3.BuyerBank, com.tools20022.repository.msg.Baseline3.SellerBank,
						com.tools20022.repository.msg.DocumentIdentification4.Submitter, com.tools20022.repository.msg.DocumentIdentification2.Submitter, com.tools20022.repository.msg.Member2.ReturnAddress,
						com.tools20022.repository.msg.Baseline4.BuyerBank, com.tools20022.repository.msg.Baseline4.SellerBank, com.tools20022.repository.msg.PaymentObligation2.ObligorBank,
						com.tools20022.repository.msg.PaymentObligation2.RecipientBank, com.tools20022.repository.msg.Baseline5.BuyerBank, com.tools20022.repository.msg.Baseline5.SellerBank,
						com.tools20022.repository.msg.RequiredSubmission6.Submitter, com.tools20022.repository.msg.Acquirer7.AcquiringInstitution, com.tools20022.repository.choice.Party28Choice.Agent);
				superType_lazy = () -> Organisation.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(BICIdentification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}