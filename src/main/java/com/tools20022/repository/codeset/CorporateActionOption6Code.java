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
import com.tools20022.repository.codeset.CorporateActionOption6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of corporate action options.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#Abstain
 * CorporateActionOption6Code.Abstain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#VoteAgainstManagement
 * CorporateActionOption6Code.VoteAgainstManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#BonusSharePlan
 * CorporateActionOption6Code.BonusSharePlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#BuyUp
 * CorporateActionOption6Code.BuyUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#CashAndSecurity
 * CorporateActionOption6Code.CashAndSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#Cash
 * CorporateActionOption6Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#ConsentAndExchange
 * CorporateActionOption6Code.ConsentAndExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#ConsentDenied
 * CorporateActionOption6Code.ConsentDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#ConsentGranted
 * CorporateActionOption6Code.ConsentGranted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#ConsentAndTender
 * CorporateActionOption6Code.ConsentAndTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#Exercise
 * CorporateActionOption6Code.Exercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#Lapse
 * CorporateActionOption6Code.Lapse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#MarkDown
 * CorporateActionOption6Code.MarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#MarkUp
 * CorporateActionOption6Code.MarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#VoteWithManagement
 * CorporateActionOption6Code.VoteWithManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#Retain
 * CorporateActionOption6Code.Retain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#NoAction
 * CorporateActionOption6Code.NoAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#NonQualifiedInvestor
 * CorporateActionOption6Code.NonQualifiedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#ProposedRate
 * CorporateActionOption6Code.ProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#Other
 * CorporateActionOption6Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#Oversubscribe
 * CorporateActionOption6Code.Oversubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#ProxyCard
 * CorporateActionOption6Code.ProxyCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#QualifiedInvestor
 * CorporateActionOption6Code.QualifiedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#Security
 * CorporateActionOption6Code.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#SellEntitlement
 * CorporateActionOption6Code.SellEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#SplitInstruction
 * CorporateActionOption6Code.SplitInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code#TaxInstruction
 * CorporateActionOption6Code.TaxInstruction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
 * CorporateActionOptionCode}</li>
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
 * "CorporateActionOption6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of corporate action options."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption10Code
 * CorporateActionOption10Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionOption6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code Abstain = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Abstain";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.Abstain.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteAgainstManagement"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code VoteAgainstManagement = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteAgainstManagement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.VoteAgainstManagement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusSharePlan"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code BonusSharePlan = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusSharePlan";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.BonusSharePlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyUp"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code BuyUp = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyUp";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.BuyUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAndSecurity"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code CashAndSecurity = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAndSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.CashAndSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code Cash = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentAndExchange"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code ConsentAndExchange = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentAndExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.ConsentAndExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentDenied"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code ConsentDenied = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentDenied";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.ConsentDenied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentGranted"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code ConsentGranted = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentGranted";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.ConsentGranted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentAndTender"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code ConsentAndTender = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentAndTender";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.ConsentAndTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercise"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code Exercise = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercise";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.Exercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lapse"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code Lapse = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lapse";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.Lapse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkDown"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code MarkDown = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkDown";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.MarkDown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkUp"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code MarkUp = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUp";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.MarkUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteWithManagement"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code VoteWithManagement = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteWithManagement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.VoteWithManagement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retain"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code Retain = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Retain";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.Retain.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code NoAction = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.NoAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonQualifiedInvestor"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code NonQualifiedInvestor = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonQualifiedInvestor";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.NonQualifiedInvestor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code ProposedRate = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedRate";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.ProposedRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code Other = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Oversubscribe"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code Oversubscribe = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Oversubscribe";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.Oversubscribe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyCard"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code ProxyCard = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyCard";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.ProxyCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedInvestor"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code QualifiedInvestor = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedInvestor";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.QualifiedInvestor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code Security = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.Security.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellEntitlement"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code SellEntitlement = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellEntitlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.SellEntitlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitInstruction"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code SplitInstruction = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.SplitInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption6Code
	 * CorporateActionOption6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxInstruction"</li>
	 * </ul>
	 */
	public static final CorporateActionOption6Code TaxInstruction = new CorporateActionOption6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption6Code.mmObject();
			codeName = CorporateActionOptionCode.TaxInstruction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionOption6Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionOption6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ABST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOption6Code";
				definition = "Specifies the type of corporate action options.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionOption10Code.mmObject());
				trace_lazy = () -> CorporateActionOptionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionOption6Code.Abstain, com.tools20022.repository.codeset.CorporateActionOption6Code.VoteAgainstManagement,
						com.tools20022.repository.codeset.CorporateActionOption6Code.BonusSharePlan, com.tools20022.repository.codeset.CorporateActionOption6Code.BuyUp,
						com.tools20022.repository.codeset.CorporateActionOption6Code.CashAndSecurity, com.tools20022.repository.codeset.CorporateActionOption6Code.Cash,
						com.tools20022.repository.codeset.CorporateActionOption6Code.ConsentAndExchange, com.tools20022.repository.codeset.CorporateActionOption6Code.ConsentDenied,
						com.tools20022.repository.codeset.CorporateActionOption6Code.ConsentGranted, com.tools20022.repository.codeset.CorporateActionOption6Code.ConsentAndTender,
						com.tools20022.repository.codeset.CorporateActionOption6Code.Exercise, com.tools20022.repository.codeset.CorporateActionOption6Code.Lapse, com.tools20022.repository.codeset.CorporateActionOption6Code.MarkDown,
						com.tools20022.repository.codeset.CorporateActionOption6Code.MarkUp, com.tools20022.repository.codeset.CorporateActionOption6Code.VoteWithManagement,
						com.tools20022.repository.codeset.CorporateActionOption6Code.Retain, com.tools20022.repository.codeset.CorporateActionOption6Code.NoAction,
						com.tools20022.repository.codeset.CorporateActionOption6Code.NonQualifiedInvestor, com.tools20022.repository.codeset.CorporateActionOption6Code.ProposedRate,
						com.tools20022.repository.codeset.CorporateActionOption6Code.Other, com.tools20022.repository.codeset.CorporateActionOption6Code.Oversubscribe, com.tools20022.repository.codeset.CorporateActionOption6Code.ProxyCard,
						com.tools20022.repository.codeset.CorporateActionOption6Code.QualifiedInvestor, com.tools20022.repository.codeset.CorporateActionOption6Code.Security,
						com.tools20022.repository.codeset.CorporateActionOption6Code.SellEntitlement, com.tools20022.repository.codeset.CorporateActionOption6Code.SplitInstruction,
						com.tools20022.repository.codeset.CorporateActionOption6Code.TaxInstruction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Abstain.getCodeName().get(), Abstain);
		codesByName.put(VoteAgainstManagement.getCodeName().get(), VoteAgainstManagement);
		codesByName.put(BonusSharePlan.getCodeName().get(), BonusSharePlan);
		codesByName.put(BuyUp.getCodeName().get(), BuyUp);
		codesByName.put(CashAndSecurity.getCodeName().get(), CashAndSecurity);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(ConsentAndExchange.getCodeName().get(), ConsentAndExchange);
		codesByName.put(ConsentDenied.getCodeName().get(), ConsentDenied);
		codesByName.put(ConsentGranted.getCodeName().get(), ConsentGranted);
		codesByName.put(ConsentAndTender.getCodeName().get(), ConsentAndTender);
		codesByName.put(Exercise.getCodeName().get(), Exercise);
		codesByName.put(Lapse.getCodeName().get(), Lapse);
		codesByName.put(MarkDown.getCodeName().get(), MarkDown);
		codesByName.put(MarkUp.getCodeName().get(), MarkUp);
		codesByName.put(VoteWithManagement.getCodeName().get(), VoteWithManagement);
		codesByName.put(Retain.getCodeName().get(), Retain);
		codesByName.put(NoAction.getCodeName().get(), NoAction);
		codesByName.put(NonQualifiedInvestor.getCodeName().get(), NonQualifiedInvestor);
		codesByName.put(ProposedRate.getCodeName().get(), ProposedRate);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Oversubscribe.getCodeName().get(), Oversubscribe);
		codesByName.put(ProxyCard.getCodeName().get(), ProxyCard);
		codesByName.put(QualifiedInvestor.getCodeName().get(), QualifiedInvestor);
		codesByName.put(Security.getCodeName().get(), Security);
		codesByName.put(SellEntitlement.getCodeName().get(), SellEntitlement);
		codesByName.put(SplitInstruction.getCodeName().get(), SplitInstruction);
		codesByName.put(TaxInstruction.getCodeName().get(), TaxInstruction);
	}

	public static CorporateActionOption6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionOption6Code[] values() {
		CorporateActionOption6Code[] values = new CorporateActionOption6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionOption6Code> {
		@Override
		public CorporateActionOption6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionOption6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}