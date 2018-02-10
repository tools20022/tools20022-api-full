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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CorporateActionOptionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionOptionTypeCode extends MMCode {

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
	public static final CorporateActionOptionTypeCode Abstain = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Abstain";
			definition = "Vote expressed as abstain. In this case, the issuing company will add the number of shares to the quorum of the meeting. If the voting right is not executed, it will not be added to the quorum. In this case, code NOAC should be used.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode VoteAgainst = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteAgainst";
			definition = "Vote against management.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode Attach = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Attach";
			definition = "Combine warrants and bonds or warrants and stock to form unit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode BearerShareExchange = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BearerShareExchange";
			definition = "Exchange from registered shares into bearer shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode BonusSharePlan = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BonusSharePlan";
			definition = "Receive shares issued from the Share Premium Reserve of the company and considered as a capital distribution rather than a disbursement of income, with different tax implications (typically found in Australia).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode BuyUp = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyUp";
			definition = "Buy additional securities to round up position.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode CashAndSecurities = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAndSecurities";
			definition = "Election choice includes a combination of both cash and securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode Cash = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Distribution of cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode ConsentAndExchange = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentAndExchange";
			definition = "Vote to consent to change the terms of the securities agreement and to exchange securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode ConsentAndTender = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentAndTender";
			definition = "Vote to consent to change the terms of the securities agreement and to tender securities for cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode ConsentDenied = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentDenied";
			definition = "Vote not to approve the event or proposal.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode Convert = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Convert";
			definition = "Convert underlying securities into other securities, not cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode ConsentGranted = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsentGranted";
			definition = "Vote to approve the event or proposal.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode Detached = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Detached";
			definition = "Separate units into individual securities - warrants and bonds, warrants and equity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode Exercise = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Exercise";
			definition = "Exercise intermediate securities or warrants.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode Lapse = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lapse";
			definition = "Allow event or entitled security to expire.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode VoteWithManagement = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VoteWithManagement";
			definition = "Vote with management.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode Retain = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Retain";
			definition = "An option that allows a holder to elect to retain their holding, eg, a putable bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode NoAction = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoAction";
			definition = "Option for the account owner not to take part in the event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode ProposedRate = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProposedRate";
			definition = "In a remarketing of variable notes, the margin that shareholders can propose in respect of the next interest period.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode Oversubscribe = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Oversubscribe";
			definition = "Subscribe to more equities than underlying securities position allows.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode ProxyCard = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProxyCard";
			definition = "Issue a proxy card in case of voting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode RegisteredShareExchange = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredShareExchange";
			definition = "Exchange from bearer shares into registered shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode RegulationsExchange = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegulationsExchange";
			definition = "Exchange of securities into the Regulation S tranche. Will typically be used in the restricted period, i.e. the period when a party can change its holdings between 144A and REGS.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode SecuritiesOption = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOption";
			definition = "Distribution of securities to holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode SellEntitlement = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellEntitlement";
			definition = "Sell the intermediate securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode SplitInstruction = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SplitInstruction";
			definition = "Option to give a split instruction, eg, a split voting instruction on a meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode Rule144A = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rule144A";
			definition = "Exchange of securities into the 144A tranche. Will typically be used in the restricted period, i.e. the period when a party can change its holdings between 144A and REGS.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode NonQualifiedInvestor = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonQualifiedInvestor";
			definition = "The account owner is a Non-Qualified Investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode Other = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Generic corporate action option to be used in case that no other specific code is appropriate.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
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
	public static final CorporateActionOptionTypeCode QualifiedInvestor = new CorporateActionOptionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QualifiedInvestor";
			definition = "The account owner is a Qualified Investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionTypeCode.mmObject();
			codeName = "QINV";
		}
	};
	final static private LinkedHashMap<String, CorporateActionOptionTypeCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionOptionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ABST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOptionTypeCode";
				definition = "Specifies the type of CA options.";
				derivation_lazy = () -> Arrays.asList(CorporateActionOptionType1Code.mmObject());
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
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Abstain.getCodeName().get(), Abstain);
		codesByName.put(VoteAgainst.getCodeName().get(), VoteAgainst);
		codesByName.put(Attach.getCodeName().get(), Attach);
		codesByName.put(BearerShareExchange.getCodeName().get(), BearerShareExchange);
		codesByName.put(BonusSharePlan.getCodeName().get(), BonusSharePlan);
		codesByName.put(BuyUp.getCodeName().get(), BuyUp);
		codesByName.put(CashAndSecurities.getCodeName().get(), CashAndSecurities);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(ConsentAndExchange.getCodeName().get(), ConsentAndExchange);
		codesByName.put(ConsentAndTender.getCodeName().get(), ConsentAndTender);
		codesByName.put(ConsentDenied.getCodeName().get(), ConsentDenied);
		codesByName.put(Convert.getCodeName().get(), Convert);
		codesByName.put(ConsentGranted.getCodeName().get(), ConsentGranted);
		codesByName.put(Detached.getCodeName().get(), Detached);
		codesByName.put(Exercise.getCodeName().get(), Exercise);
		codesByName.put(Lapse.getCodeName().get(), Lapse);
		codesByName.put(VoteWithManagement.getCodeName().get(), VoteWithManagement);
		codesByName.put(Retain.getCodeName().get(), Retain);
		codesByName.put(NoAction.getCodeName().get(), NoAction);
		codesByName.put(ProposedRate.getCodeName().get(), ProposedRate);
		codesByName.put(Oversubscribe.getCodeName().get(), Oversubscribe);
		codesByName.put(ProxyCard.getCodeName().get(), ProxyCard);
		codesByName.put(RegisteredShareExchange.getCodeName().get(), RegisteredShareExchange);
		codesByName.put(RegulationsExchange.getCodeName().get(), RegulationsExchange);
		codesByName.put(SecuritiesOption.getCodeName().get(), SecuritiesOption);
		codesByName.put(SellEntitlement.getCodeName().get(), SellEntitlement);
		codesByName.put(SplitInstruction.getCodeName().get(), SplitInstruction);
		codesByName.put(Rule144A.getCodeName().get(), Rule144A);
		codesByName.put(NonQualifiedInvestor.getCodeName().get(), NonQualifiedInvestor);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(QualifiedInvestor.getCodeName().get(), QualifiedInvestor);
	}

	public static CorporateActionOptionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionOptionTypeCode[] values() {
		CorporateActionOptionTypeCode[] values = new CorporateActionOptionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionOptionTypeCode> {
		@Override
		public CorporateActionOptionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionOptionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}