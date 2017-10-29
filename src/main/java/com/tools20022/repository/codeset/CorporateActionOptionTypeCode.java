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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of CA options.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#Abstain
 * CorporateActionOptionTypeCode.Abstain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#VoteAgainst
 * CorporateActionOptionTypeCode.VoteAgainst}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#Attach
 * CorporateActionOptionTypeCode.Attach}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#BearerShareExchange
 * CorporateActionOptionTypeCode.BearerShareExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#BonusSharePlan
 * CorporateActionOptionTypeCode.BonusSharePlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#BuyUp
 * CorporateActionOptionTypeCode.BuyUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#CashAndSecurities
 * CorporateActionOptionTypeCode.CashAndSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#Cash
 * CorporateActionOptionTypeCode.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#ConsentAndExchange
 * CorporateActionOptionTypeCode.ConsentAndExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#ConsentAndTender
 * CorporateActionOptionTypeCode.ConsentAndTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#ConsentDenied
 * CorporateActionOptionTypeCode.ConsentDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#Convert
 * CorporateActionOptionTypeCode.Convert}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#ConsentGranted
 * CorporateActionOptionTypeCode.ConsentGranted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#Detached
 * CorporateActionOptionTypeCode.Detached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#Exercise
 * CorporateActionOptionTypeCode.Exercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#Lapse
 * CorporateActionOptionTypeCode.Lapse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#VoteWithManagement
 * CorporateActionOptionTypeCode.VoteWithManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#Retain
 * CorporateActionOptionTypeCode.Retain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#NoAction
 * CorporateActionOptionTypeCode.NoAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#ProposedRate
 * CorporateActionOptionTypeCode.ProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#Oversubscribe
 * CorporateActionOptionTypeCode.Oversubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#ProxyCard
 * CorporateActionOptionTypeCode.ProxyCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#RegisteredShareExchange
 * CorporateActionOptionTypeCode.RegisteredShareExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#RegulationsExchange
 * CorporateActionOptionTypeCode.RegulationsExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#SecuritiesOption
 * CorporateActionOptionTypeCode.SecuritiesOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#SellEntitlement
 * CorporateActionOptionTypeCode.SellEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#SplitInstruction
 * CorporateActionOptionTypeCode.SplitInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#Rule144A
 * CorporateActionOptionTypeCode.Rule144A}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#NonQualifiedInvestor
 * CorporateActionOptionTypeCode.NonQualifiedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#Other
 * CorporateActionOptionTypeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode#QualifiedInvestor
 * CorporateActionOptionTypeCode.QualifiedInvestor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
 * CorporateActionOptionType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ABST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionOptionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of CA options."</li>
 * </ul>
 */
public class CorporateActionOptionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Vote expressed as abstain. In this case, the issuing company will add the
	 * number of shares to the quorum of the meeting. If the voting right is not
	 * executed, it will not be added to the quorum. In this case, code NOAC
	 * should be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote expressed as abstain. In this case, the issuing company will add the number of shares to the quorum of the meeting. If the voting right is not executed, it will not be added to the quorum. In this case, code NOAC should be used."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Abstain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Abstain";
			definition = "Vote expressed as abstain. In this case, the issuing company will add the number of shares to the quorum of the meeting. If the voting right is not executed, it will not be added to the quorum. In this case, code NOAC should be used.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "ABST";
		}
	};
	/**
	 * Vote against management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteAgainst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vote against management."</li>
	 * </ul>
	 */
	public static final MMCode VoteAgainst = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteAgainst";
			definition = "Vote against management.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "AMGT";
		}
	};
	/**
	 * Combine warrants and bonds or warrants and stock to form unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attach"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Combine warrants and bonds or warrants and stock to form unit."</li>
	 * </ul>
	 */
	public static final MMCode Attach = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Attach";
			definition = "Combine warrants and bonds or warrants and stock to form unit.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "ATCH";
		}
	};
	/**
	 * Exchange from registered shares into bearer shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearerShareExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange from registered shares into bearer shares."</li>
	 * </ul>
	 */
	public static final MMCode BearerShareExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BearerShareExchange";
			definition = "Exchange from registered shares into bearer shares.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "BEAR";
		}
	};
	/**
	 * Receive shares issued from the Share Premium Reserve of the company and
	 * considered as a capital distribution rather than a disbursement of
	 * income, with different tax implications (typically found in Australia).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusSharePlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Receive shares issued from the Share Premium Reserve of the company and considered as a capital distribution rather than a disbursement of income, with different tax implications (typically found in Australia)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode BonusSharePlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BonusSharePlan";
			definition = "Receive shares issued from the Share Premium Reserve of the company and considered as a capital distribution rather than a disbursement of income, with different tax implications (typically found in Australia).";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "BSPL";
		}
	};
	/**
	 * Buy additional securities to round up position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUYA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Buy additional securities to round up position."</li>
	 * </ul>
	 */
	public static final MMCode BuyUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyUp";
			definition = "Buy additional securities to round up position.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "BUYA";
		}
	};
	/**
	 * Election choice includes a combination of both cash and securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAndSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Election choice includes a combination of both cash and securities."</li>
	 * </ul>
	 */
	public static final MMCode CashAndSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAndSecurities";
			definition = "Election choice includes a combination of both cash and securities.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "CASE";
		}
	};
	/**
	 * Distribution of cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution of cash."</li>
	 * </ul>
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Distribution of cash.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Vote to consent to change the terms of the securities agreement and to
	 * exchange securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEXC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentAndExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote to consent to change the terms of the securities agreement and to exchange securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ConsentAndExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentAndExchange";
			definition = "Vote to consent to change the terms of the securities agreement and to exchange securities.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "CEXC";
		}
	};
	/**
	 * Vote to consent to change the terms of the securities agreement and to
	 * tender securities for cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentAndTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote to consent to change the terms of the securities agreement and to tender securities for cash."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ConsentAndTender = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentAndTender";
			definition = "Vote to consent to change the terms of the securities agreement and to tender securities for cash.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "CTEN";
		}
	};
	/**
	 * Vote not to approve the event or proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentDenied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vote not to approve the event or proposal."</li>
	 * </ul>
	 */
	public static final MMCode ConsentDenied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentDenied";
			definition = "Vote not to approve the event or proposal.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "CONN";
		}
	};
	/**
	 * Convert underlying securities into other securities, not cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Convert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Convert underlying securities into other securities, not cash."</li>
	 * </ul>
	 */
	public static final MMCode Convert = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Convert";
			definition = "Convert underlying securities into other securities, not cash.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Vote to approve the event or proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentGranted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vote to approve the event or proposal."</li>
	 * </ul>
	 */
	public static final MMCode ConsentGranted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentGranted";
			definition = "Vote to approve the event or proposal.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "CONY";
		}
	};
	/**
	 * Separate units into individual securities - warrants and bonds, warrants
	 * and equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DETH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detached"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separate units into individual securities - warrants and bonds, warrants and equity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Detached = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Detached";
			definition = "Separate units into individual securities - warrants and bonds, warrants and equity.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "DETH";
		}
	};
	/**
	 * Exercise intermediate securities or warrants.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercise"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exercise intermediate securities or warrants."</li>
	 * </ul>
	 */
	public static final MMCode Exercise = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Exercise";
			definition = "Exercise intermediate securities or warrants.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "EXER";
		}
	};
	/**
	 * Allow event or entitled security to expire.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LAPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lapse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allow event or entitled security to expire."</li>
	 * </ul>
	 */
	public static final MMCode Lapse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lapse";
			definition = "Allow event or entitled security to expire.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "LAPS";
		}
	};
	/**
	 * Vote with management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteWithManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vote with management."</li>
	 * </ul>
	 */
	public static final MMCode VoteWithManagement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteWithManagement";
			definition = "Vote with management.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "MNGT";
		}
	};
	/**
	 * An option that allows a holder to elect to retain their holding, eg, a
	 * putable bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MPUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An option that allows a holder to elect to retain their holding, eg, a putable bond."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Retain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Retain";
			definition = "An option that allows a holder to elect to retain their holding, eg, a putable bond.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "MPUT";
		}
	};
	/**
	 * Option for the account owner not to take part in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option for the account owner not to take part in the event."</li>
	 * </ul>
	 */
	public static final MMCode NoAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoAction";
			definition = "Option for the account owner not to take part in the event.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * In a remarketing of variable notes, the margin that shareholders can
	 * propose in respect of the next interest period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In a remarketing of variable notes, the margin that shareholders can propose in respect of the next interest period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ProposedRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProposedRate";
			definition = "In a remarketing of variable notes, the margin that shareholders can propose in respect of the next interest period.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "OFFR";
		}
	};
	/**
	 * Subscribe to more equities than underlying securities position allows.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Oversubscribe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subscribe to more equities than underlying securities position allows."</li>
	 * </ul>
	 */
	public static final MMCode Oversubscribe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Oversubscribe";
			definition = "Subscribe to more equities than underlying securities position allows.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * Issue a proxy card in case of voting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue a proxy card in case of voting."</li>
	 * </ul>
	 */
	public static final MMCode ProxyCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyCard";
			definition = "Issue a proxy card in case of voting.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "PROX";
		}
	};
	/**
	 * Exchange from bearer shares into registered shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredShareExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange from bearer shares into registered shares."</li>
	 * </ul>
	 */
	public static final MMCode RegisteredShareExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredShareExchange";
			definition = "Exchange from bearer shares into registered shares.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "REGD";
		}
	};
	/**
	 * Exchange of securities into the Regulation S tranche. Will typically be
	 * used in the restricted period, i.e. the period when a party can change
	 * its holdings between 144A and REGS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulationsExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange of securities into the Regulation S tranche. Will typically be used in the restricted period, i.e. the period when a party can change its holdings between 144A and REGS."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RegulationsExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegulationsExchange";
			definition = "Exchange of securities into the Regulation S tranche. Will typically be used in the restricted period, i.e. the period when a party can change its holdings between 144A and REGS.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "REGS";
		}
	};
	/**
	 * Distribution of securities to holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution of securities to holders."</li>
	 * </ul>
	 */
	public static final MMCode SecuritiesOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOption";
			definition = "Distribution of securities to holders.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Sell the intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sell the intermediate securities."</li>
	 * </ul>
	 */
	public static final MMCode SellEntitlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellEntitlement";
			definition = "Sell the intermediate securities.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "SLLE";
		}
	};
	/**
	 * Option to give a split instruction, eg, a split voting instruction on a
	 * meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option to give a split instruction, eg, a split voting instruction on a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMCode SplitInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitInstruction";
			definition = "Option to give a split instruction, eg, a split voting instruction on a meeting.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "SPLI";
		}
	};
	/**
	 * Exchange of securities into the 144A tranche. Will typically be used in
	 * the restricted period, i.e. the period when a party can change its
	 * holdings between 144A and REGS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "144A"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rule144A"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange of securities into the 144A tranche. Will typically be used in the restricted period, i.e. the period when a party can change its holdings between 144A and REGS."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Rule144A = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rule144A";
			definition = "Exchange of securities into the 144A tranche. Will typically be used in the restricted period, i.e. the period when a party can change its holdings between 144A and REGS.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "144A";
		}
	};
	/**
	 * The account owner is a Non-Qualified Investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonQualifiedInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The account owner is a Non-Qualified Investor."</li>
	 * </ul>
	 */
	public static final MMCode NonQualifiedInvestor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonQualifiedInvestor";
			definition = "The account owner is a Non-Qualified Investor.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "NOQU";
		}
	};
	/**
	 * Generic corporate action option to be used in case that no other specific
	 * code is appropriate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic corporate action option to be used in case that no other specific code is appropriate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Generic corporate action option to be used in case that no other specific code is appropriate.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * The account owner is a Qualified Investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
	 * CorporateActionOptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The account owner is a Qualified Investor."</li>
	 * </ul>
	 */
	public static final MMCode QualifiedInvestor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QualifiedInvestor";
			definition = "The account owner is a Qualified Investor.";
			owner_lazy = () -> CorporateActionOptionTypeCode.mmObject();
			codeName = "QINV";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ABST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOptionTypeCode";
				definition = "Specifies the type of CA options.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionOptionTypeCode.Abstain, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.VoteAgainst,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.Attach, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.BearerShareExchange,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.BonusSharePlan, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.BuyUp,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.CashAndSecurities, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.Cash,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.ConsentAndExchange, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.ConsentAndTender,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.ConsentDenied, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.Convert,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.ConsentGranted, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.Detached,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.Exercise, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.Lapse,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.VoteWithManagement, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.Retain,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.NoAction, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.ProposedRate,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.Oversubscribe, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.ProxyCard,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.RegisteredShareExchange, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.RegulationsExchange,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.SecuritiesOption, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.SellEntitlement,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.SplitInstruction, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.Rule144A,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.NonQualifiedInvestor, com.tools20022.repository.codeset.CorporateActionOptionTypeCode.Other,
						com.tools20022.repository.codeset.CorporateActionOptionTypeCode.QualifiedInvestor);
				derivation_lazy = () -> Arrays.asList(CorporateActionOptionType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}