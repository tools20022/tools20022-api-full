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
import com.tools20022.repository.codeset.CorporateActionOption8Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#Abstain
 * CorporateActionOption8Code.Abstain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#VoteAgainstManagement
 * CorporateActionOption8Code.VoteAgainstManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#BonusSharePlan
 * CorporateActionOption8Code.BonusSharePlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#BuyUp
 * CorporateActionOption8Code.BuyUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#CashAndSecurity
 * CorporateActionOption8Code.CashAndSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#Cash
 * CorporateActionOption8Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#ConsentAndExchange
 * CorporateActionOption8Code.ConsentAndExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#ConsentDenied
 * CorporateActionOption8Code.ConsentDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#ConsentGranted
 * CorporateActionOption8Code.ConsentGranted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#ConsentAndTender
 * CorporateActionOption8Code.ConsentAndTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#Exercise
 * CorporateActionOption8Code.Exercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#Lapse
 * CorporateActionOption8Code.Lapse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#MarkDown
 * CorporateActionOption8Code.MarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#MarkUp
 * CorporateActionOption8Code.MarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#VoteWithManagement
 * CorporateActionOption8Code.VoteWithManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#Retain
 * CorporateActionOption8Code.Retain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#NoAction
 * CorporateActionOption8Code.NoAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#NonQualifiedInvestor
 * CorporateActionOption8Code.NonQualifiedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#ProposedRate
 * CorporateActionOption8Code.ProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#Other
 * CorporateActionOption8Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#Oversubscribe
 * CorporateActionOption8Code.Oversubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#ProxyCard
 * CorporateActionOption8Code.ProxyCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#QualifiedInvestor
 * CorporateActionOption8Code.QualifiedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#Security
 * CorporateActionOption8Code.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#SellEntitlement
 * CorporateActionOption8Code.SellEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#SplitInstruction
 * CorporateActionOption8Code.SplitInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code#UnknownProceeds
 * CorporateActionOption8Code.UnknownProceeds}</li>
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
 * "CorporateActionOption8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of corporate action options."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption3Code
 * CorporateActionOption3Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionOption8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code Abstain = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Abstain";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.Abstain.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteAgainstManagement"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code VoteAgainstManagement = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteAgainstManagement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.VoteAgainstManagement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusSharePlan"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code BonusSharePlan = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusSharePlan";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.BonusSharePlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyUp"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code BuyUp = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyUp";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.BuyUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAndSecurity"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code CashAndSecurity = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAndSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.CashAndSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code Cash = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentAndExchange"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code ConsentAndExchange = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentAndExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.ConsentAndExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentDenied"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code ConsentDenied = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentDenied";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.ConsentDenied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentGranted"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code ConsentGranted = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentGranted";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.ConsentGranted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentAndTender"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code ConsentAndTender = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentAndTender";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.ConsentAndTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercise"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code Exercise = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercise";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.Exercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lapse"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code Lapse = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lapse";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.Lapse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkDown"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code MarkDown = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkDown";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.MarkDown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkUp"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code MarkUp = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUp";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.MarkUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteWithManagement"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code VoteWithManagement = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteWithManagement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.VoteWithManagement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retain"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code Retain = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Retain";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.Retain.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code NoAction = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.NoAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonQualifiedInvestor"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code NonQualifiedInvestor = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonQualifiedInvestor";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.NonQualifiedInvestor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code ProposedRate = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedRate";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.ProposedRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code Other = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Oversubscribe"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code Oversubscribe = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Oversubscribe";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.Oversubscribe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyCard"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code ProxyCard = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyCard";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.ProxyCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedInvestor"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code QualifiedInvestor = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedInvestor";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.QualifiedInvestor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code Security = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.Security.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellEntitlement"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code SellEntitlement = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellEntitlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.SellEntitlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitInstruction"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code SplitInstruction = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.SplitInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOption8Code
	 * CorporateActionOption8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownProceeds"</li>
	 * </ul>
	 */
	public static final CorporateActionOption8Code UnknownProceeds = new CorporateActionOption8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownProceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOption8Code.mmObject();
			codeName = CorporateActionOptionCode.UnknownProceeds.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionOption8Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionOption8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ABST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOption8Code";
				definition = "Specifies the type of corporate action options.";
				previousVersion_lazy = () -> CorporateActionOption3Code.mmObject();
				trace_lazy = () -> CorporateActionOptionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionOption8Code.Abstain, com.tools20022.repository.codeset.CorporateActionOption8Code.VoteAgainstManagement,
						com.tools20022.repository.codeset.CorporateActionOption8Code.BonusSharePlan, com.tools20022.repository.codeset.CorporateActionOption8Code.BuyUp,
						com.tools20022.repository.codeset.CorporateActionOption8Code.CashAndSecurity, com.tools20022.repository.codeset.CorporateActionOption8Code.Cash,
						com.tools20022.repository.codeset.CorporateActionOption8Code.ConsentAndExchange, com.tools20022.repository.codeset.CorporateActionOption8Code.ConsentDenied,
						com.tools20022.repository.codeset.CorporateActionOption8Code.ConsentGranted, com.tools20022.repository.codeset.CorporateActionOption8Code.ConsentAndTender,
						com.tools20022.repository.codeset.CorporateActionOption8Code.Exercise, com.tools20022.repository.codeset.CorporateActionOption8Code.Lapse, com.tools20022.repository.codeset.CorporateActionOption8Code.MarkDown,
						com.tools20022.repository.codeset.CorporateActionOption8Code.MarkUp, com.tools20022.repository.codeset.CorporateActionOption8Code.VoteWithManagement,
						com.tools20022.repository.codeset.CorporateActionOption8Code.Retain, com.tools20022.repository.codeset.CorporateActionOption8Code.NoAction,
						com.tools20022.repository.codeset.CorporateActionOption8Code.NonQualifiedInvestor, com.tools20022.repository.codeset.CorporateActionOption8Code.ProposedRate,
						com.tools20022.repository.codeset.CorporateActionOption8Code.Other, com.tools20022.repository.codeset.CorporateActionOption8Code.Oversubscribe, com.tools20022.repository.codeset.CorporateActionOption8Code.ProxyCard,
						com.tools20022.repository.codeset.CorporateActionOption8Code.QualifiedInvestor, com.tools20022.repository.codeset.CorporateActionOption8Code.Security,
						com.tools20022.repository.codeset.CorporateActionOption8Code.SellEntitlement, com.tools20022.repository.codeset.CorporateActionOption8Code.SplitInstruction,
						com.tools20022.repository.codeset.CorporateActionOption8Code.UnknownProceeds);
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
		codesByName.put(UnknownProceeds.getCodeName().get(), UnknownProceeds);
	}

	public static CorporateActionOption8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionOption8Code[] values() {
		CorporateActionOption8Code[] values = new CorporateActionOption8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionOption8Code> {
		@Override
		public CorporateActionOption8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionOption8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}