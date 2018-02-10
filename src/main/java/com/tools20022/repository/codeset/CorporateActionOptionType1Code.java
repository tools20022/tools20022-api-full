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
import com.tools20022.repository.codeset.CorporateActionOptionType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#BonusSharePlan
 * CorporateActionOptionType1Code.BonusSharePlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#BuyUp
 * CorporateActionOptionType1Code.BuyUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#CashAndSecurities
 * CorporateActionOptionType1Code.CashAndSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#Cash
 * CorporateActionOptionType1Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#ConsentAndExchange
 * CorporateActionOptionType1Code.ConsentAndExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#ConsentAndTender
 * CorporateActionOptionType1Code.ConsentAndTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#ConsentDenied
 * CorporateActionOptionType1Code.ConsentDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#ConsentGranted
 * CorporateActionOptionType1Code.ConsentGranted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#Exercise
 * CorporateActionOptionType1Code.Exercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#Lapse
 * CorporateActionOptionType1Code.Lapse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#Retain
 * CorporateActionOptionType1Code.Retain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#NoAction
 * CorporateActionOptionType1Code.NoAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#ProposedRate
 * CorporateActionOptionType1Code.ProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#Oversubscribe
 * CorporateActionOptionType1Code.Oversubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#SecuritiesOption
 * CorporateActionOptionType1Code.SecuritiesOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#SellEntitlement
 * CorporateActionOptionType1Code.SellEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#SplitInstruction
 * CorporateActionOptionType1Code.SplitInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#NonQualifiedInvestor
 * CorporateActionOptionType1Code.NonQualifiedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#Other
 * CorporateActionOptionType1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code#QualifiedInvestor
 * CorporateActionOptionType1Code.QualifiedInvestor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionTypeCode
 * CorporateActionOptionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BSPL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionOptionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of CA options."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionOptionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusSharePlan"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code BonusSharePlan = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusSharePlan";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.BonusSharePlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyUp"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code BuyUp = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyUp";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.BuyUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAndSecurities"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code CashAndSecurities = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAndSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.CashAndSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code Cash = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentAndExchange"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code ConsentAndExchange = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentAndExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.ConsentAndExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentAndTender"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code ConsentAndTender = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentAndTender";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.ConsentAndTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentDenied"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code ConsentDenied = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentDenied";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.ConsentDenied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsentGranted"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code ConsentGranted = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsentGranted";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.ConsentGranted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercise"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code Exercise = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercise";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.Exercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lapse"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code Lapse = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lapse";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.Lapse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Retain"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code Retain = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Retain";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.Retain.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code NoAction = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.NoAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code ProposedRate = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedRate";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.ProposedRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Oversubscribe"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code Oversubscribe = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Oversubscribe";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.Oversubscribe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOption"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code SecuritiesOption = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.SecuritiesOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellEntitlement"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code SellEntitlement = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellEntitlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.SellEntitlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitInstruction"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code SplitInstruction = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.SplitInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonQualifiedInvestor"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code NonQualifiedInvestor = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonQualifiedInvestor";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.NonQualifiedInvestor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code Other = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionType1Code
	 * CorporateActionOptionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualifiedInvestor"</li>
	 * </ul>
	 */
	public static final CorporateActionOptionType1Code QualifiedInvestor = new CorporateActionOptionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QualifiedInvestor";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionOptionType1Code.mmObject();
			codeName = CorporateActionOptionTypeCode.QualifiedInvestor.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionOptionType1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionOptionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BSPL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOptionType1Code";
				definition = "Specifies the type of CA options.";
				trace_lazy = () -> CorporateActionOptionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionOptionType1Code.BonusSharePlan, com.tools20022.repository.codeset.CorporateActionOptionType1Code.BuyUp,
						com.tools20022.repository.codeset.CorporateActionOptionType1Code.CashAndSecurities, com.tools20022.repository.codeset.CorporateActionOptionType1Code.Cash,
						com.tools20022.repository.codeset.CorporateActionOptionType1Code.ConsentAndExchange, com.tools20022.repository.codeset.CorporateActionOptionType1Code.ConsentAndTender,
						com.tools20022.repository.codeset.CorporateActionOptionType1Code.ConsentDenied, com.tools20022.repository.codeset.CorporateActionOptionType1Code.ConsentGranted,
						com.tools20022.repository.codeset.CorporateActionOptionType1Code.Exercise, com.tools20022.repository.codeset.CorporateActionOptionType1Code.Lapse,
						com.tools20022.repository.codeset.CorporateActionOptionType1Code.Retain, com.tools20022.repository.codeset.CorporateActionOptionType1Code.NoAction,
						com.tools20022.repository.codeset.CorporateActionOptionType1Code.ProposedRate, com.tools20022.repository.codeset.CorporateActionOptionType1Code.Oversubscribe,
						com.tools20022.repository.codeset.CorporateActionOptionType1Code.SecuritiesOption, com.tools20022.repository.codeset.CorporateActionOptionType1Code.SellEntitlement,
						com.tools20022.repository.codeset.CorporateActionOptionType1Code.SplitInstruction, com.tools20022.repository.codeset.CorporateActionOptionType1Code.NonQualifiedInvestor,
						com.tools20022.repository.codeset.CorporateActionOptionType1Code.Other, com.tools20022.repository.codeset.CorporateActionOptionType1Code.QualifiedInvestor);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BonusSharePlan.getCodeName().get(), BonusSharePlan);
		codesByName.put(BuyUp.getCodeName().get(), BuyUp);
		codesByName.put(CashAndSecurities.getCodeName().get(), CashAndSecurities);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(ConsentAndExchange.getCodeName().get(), ConsentAndExchange);
		codesByName.put(ConsentAndTender.getCodeName().get(), ConsentAndTender);
		codesByName.put(ConsentDenied.getCodeName().get(), ConsentDenied);
		codesByName.put(ConsentGranted.getCodeName().get(), ConsentGranted);
		codesByName.put(Exercise.getCodeName().get(), Exercise);
		codesByName.put(Lapse.getCodeName().get(), Lapse);
		codesByName.put(Retain.getCodeName().get(), Retain);
		codesByName.put(NoAction.getCodeName().get(), NoAction);
		codesByName.put(ProposedRate.getCodeName().get(), ProposedRate);
		codesByName.put(Oversubscribe.getCodeName().get(), Oversubscribe);
		codesByName.put(SecuritiesOption.getCodeName().get(), SecuritiesOption);
		codesByName.put(SellEntitlement.getCodeName().get(), SellEntitlement);
		codesByName.put(SplitInstruction.getCodeName().get(), SplitInstruction);
		codesByName.put(NonQualifiedInvestor.getCodeName().get(), NonQualifiedInvestor);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(QualifiedInvestor.getCodeName().get(), QualifiedInvestor);
	}

	public static CorporateActionOptionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionOptionType1Code[] values() {
		CorporateActionOptionType1Code[] values = new CorporateActionOptionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionOptionType1Code> {
		@Override
		public CorporateActionOptionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionOptionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}