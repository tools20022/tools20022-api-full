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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemMember2#mmMemberIdentification
 * SystemMember2.mmMemberIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party7Choice#mmAgent
 * Party7Choice.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party12Choice#mmAgent
 * Party12Choice.mmAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5#mmIdentificationIssuer
 * DocumentIdentification5.mmIdentificationIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1#mmSubmitter
 * DocumentIdentification1.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission1#mmSubmitter
 * RequiredSubmission1.mmSubmitter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmBuyerBank
 * Baseline2.mmBuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline2#mmSellerBank
 * Baseline2.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmObligorBank
 * PaymentObligation1.mmObligorBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation1#mmRecipientBank
 * PaymentObligation1.mmRecipientBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmSubmitter
 * RequiredSubmission3.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmSubmitter
 * RequiredSubmission4.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission5#mmSubmitter
 * RequiredSubmission5.mmSubmitter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmBuyerBank
 * Baseline3.mmBuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline3#mmSellerBank
 * Baseline3.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification4#mmSubmitter
 * DocumentIdentification4.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DocumentIdentification2#mmSubmitter
 * DocumentIdentification2.mmSubmitter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Member2#mmReturnAddress
 * Member2.mmReturnAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmBuyerBank
 * Baseline4.mmBuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline4#mmSellerBank
 * Baseline4.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmObligorBank
 * PaymentObligation2.mmObligorBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentObligation2#mmRecipientBank
 * PaymentObligation2.mmRecipientBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmBuyerBank
 * Baseline5.mmBuyerBank}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Baseline5#mmSellerBank
 * Baseline5.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission6#mmSubmitter
 * RequiredSubmission6.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Acquirer7#mmAcquiringInstitution
 * Acquirer7.mmAcquiringInstitution}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party28Choice#mmAgent
 * Party28Choice.mmAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature5Choice#mmFinancialInstitution
 * CounterpartyTradeNature5Choice.mmFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature4Choice#mmFinancialInstitution
 * CounterpartyTradeNature4Choice.mmFinancialInstitution}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party35Choice#mmAgent
 * Party35Choice.mmAgent}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstitution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organisation established primarily to provide financial services."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class FinancialInstitution extends Organisation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitution";
				definition = "Organisation established primarily to provide financial services.";
				derivationElement_lazy = () -> Arrays.asList(SystemMember2.mmMemberIdentification, Party7Choice.mmAgent, Party12Choice.mmAgent, DocumentIdentification5.mmIdentificationIssuer, DocumentIdentification1.mmSubmitter,
						RequiredSubmission1.mmSubmitter, Baseline2.mmBuyerBank, Baseline2.mmSellerBank, PaymentObligation1.mmObligorBank, PaymentObligation1.mmRecipientBank, RequiredSubmission3.mmSubmitter, RequiredSubmission4.mmSubmitter,
						RequiredSubmission5.mmSubmitter, Baseline3.mmBuyerBank, Baseline3.mmSellerBank, DocumentIdentification4.mmSubmitter, DocumentIdentification2.mmSubmitter, Member2.mmReturnAddress, Baseline4.mmBuyerBank,
						Baseline4.mmSellerBank, PaymentObligation2.mmObligorBank, PaymentObligation2.mmRecipientBank, Baseline5.mmBuyerBank, Baseline5.mmSellerBank, RequiredSubmission6.mmSubmitter, Acquirer7.mmAcquiringInstitution,
						Party28Choice.mmAgent, CounterpartyTradeNature5Choice.mmFinancialInstitution, CounterpartyTradeNature4Choice.mmFinancialInstitution, Party35Choice.mmAgent);
				superType_lazy = () -> Organisation.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(BICIdentification1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstitution.class;
			}
		});
		return mmObject_lazy.get();
	}
}