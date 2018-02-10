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
import com.tools20022.repository.codeset.SettlementTransactionCondition10Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the conditions under which the order/trade is to be settled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#AcceptAfterRegularSettlementDeadline
 * SettlementTransactionCondition10Code.AcceptAfterRegularSettlementDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Assignement
 * SettlementTransactionCondition10Code.Assignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#BuytoCover
 * SettlementTransactionCondition10Code.BuytoCover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Clean
 * SettlementTransactionCondition10Code.Clean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#DeliveryWithoutMatching
 * SettlementTransactionCondition10Code.DeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Dirty
 * SettlementTransactionCondition10Code.Dirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Drawn
 * SettlementTransactionCondition10Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Exercised
 * SettlementTransactionCondition10Code.Exercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Expired
 * SettlementTransactionCondition10Code.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#FreeCleanSettlement
 * SettlementTransactionCondition10Code.FreeCleanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#KnockedOut
 * SettlementTransactionCondition10Code.KnockedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#NoAutomaticMarketClaim
 * SettlementTransactionCondition10Code.NoAutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#NotAccountingRelated
 * SettlementTransactionCondition10Code.NotAccountingRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#PendingSale
 * SettlementTransactionCondition10Code.PendingSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Physical
 * SettlementTransactionCondition10Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Rehypothecation
 * SettlementTransactionCondition10Code.Rehypothecation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Reporting
 * SettlementTransactionCondition10Code.Reporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Residual
 * SettlementTransactionCondition10Code.Residual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#ShortSell
 * SettlementTransactionCondition10Code.ShortSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#SpecialDelivery
 * SettlementTransactionCondition10Code.SpecialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#SplitSettlement
 * SettlementTransactionCondition10Code.SplitSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Transformation
 * SettlementTransactionCondition10Code.Transformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#TripartySegregation
 * SettlementTransactionCondition10Code.TripartySegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code#Unexposed
 * SettlementTransactionCondition10Code.Unexposed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
 * SettlementTransactionConditionCode}</li>
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
 * "SettlementTransactionCondition10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be settled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementTransactionCondition10Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptAfterRegularSettlementDeadline"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code AcceptAfterRegularSettlementDeadline = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptAfterRegularSettlementDeadline";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.AcceptAfterRegularSettlementDeadline.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Assignement = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Assignement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuytoCover"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code BuytoCover = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuytoCover";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.BuytoCover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Clean = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clean";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Clean.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryWithoutMatching"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code DeliveryWithoutMatching = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryWithoutMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.DeliveryWithoutMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Dirty = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dirty";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Dirty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Drawn = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Drawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercised"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Exercised = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercised";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Exercised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Expired = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Expired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeCleanSettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code FreeCleanSettlement = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeCleanSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.FreeCleanSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnockedOut"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code KnockedOut = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnockedOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.KnockedOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaim"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code NoAutomaticMarketClaim = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomaticMarketClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.NoAutomaticMarketClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAccountingRelated"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code NotAccountingRelated = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAccountingRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.NotAccountingRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSale"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code PendingSale = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSale";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.PendingSale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Physical = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Physical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rehypothecation"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Rehypothecation = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rehypothecation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Rehypothecation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Reporting = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Reporting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residual"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Residual = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Residual";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Residual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSell"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code ShortSell = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortSell";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.ShortSell.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDelivery"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code SpecialDelivery = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.SpecialDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitSettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code SplitSettlement = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.SplitSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transformation"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Transformation = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transformation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Transformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartySegregation"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code TripartySegregation = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartySegregation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.TripartySegregation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition10Code
	 * SettlementTransactionCondition10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unexposed"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition10Code Unexposed = new SettlementTransactionCondition10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unexposed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition10Code.mmObject();
			codeName = SettlementTransactionConditionCode.Unexposed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementTransactionCondition10Code> codesByName = new LinkedHashMap<>();

	protected SettlementTransactionCondition10Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionCondition10Code";
				definition = "Specifies the conditions under which the order/trade is to be settled.";
				trace_lazy = () -> SettlementTransactionConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionCondition10Code.AcceptAfterRegularSettlementDeadline,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Assignement, com.tools20022.repository.codeset.SettlementTransactionCondition10Code.BuytoCover,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Clean, com.tools20022.repository.codeset.SettlementTransactionCondition10Code.DeliveryWithoutMatching,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Dirty, com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Drawn,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Exercised, com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Expired,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.FreeCleanSettlement, com.tools20022.repository.codeset.SettlementTransactionCondition10Code.KnockedOut,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.NoAutomaticMarketClaim, com.tools20022.repository.codeset.SettlementTransactionCondition10Code.NotAccountingRelated,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.PendingSale, com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Physical,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Rehypothecation, com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Reporting,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Residual, com.tools20022.repository.codeset.SettlementTransactionCondition10Code.ShortSell,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.SpecialDelivery, com.tools20022.repository.codeset.SettlementTransactionCondition10Code.SplitSettlement,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Transformation, com.tools20022.repository.codeset.SettlementTransactionCondition10Code.TripartySegregation,
						com.tools20022.repository.codeset.SettlementTransactionCondition10Code.Unexposed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcceptAfterRegularSettlementDeadline.getCodeName().get(), AcceptAfterRegularSettlementDeadline);
		codesByName.put(Assignement.getCodeName().get(), Assignement);
		codesByName.put(BuytoCover.getCodeName().get(), BuytoCover);
		codesByName.put(Clean.getCodeName().get(), Clean);
		codesByName.put(DeliveryWithoutMatching.getCodeName().get(), DeliveryWithoutMatching);
		codesByName.put(Dirty.getCodeName().get(), Dirty);
		codesByName.put(Drawn.getCodeName().get(), Drawn);
		codesByName.put(Exercised.getCodeName().get(), Exercised);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(FreeCleanSettlement.getCodeName().get(), FreeCleanSettlement);
		codesByName.put(KnockedOut.getCodeName().get(), KnockedOut);
		codesByName.put(NoAutomaticMarketClaim.getCodeName().get(), NoAutomaticMarketClaim);
		codesByName.put(NotAccountingRelated.getCodeName().get(), NotAccountingRelated);
		codesByName.put(PendingSale.getCodeName().get(), PendingSale);
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(Rehypothecation.getCodeName().get(), Rehypothecation);
		codesByName.put(Reporting.getCodeName().get(), Reporting);
		codesByName.put(Residual.getCodeName().get(), Residual);
		codesByName.put(ShortSell.getCodeName().get(), ShortSell);
		codesByName.put(SpecialDelivery.getCodeName().get(), SpecialDelivery);
		codesByName.put(SplitSettlement.getCodeName().get(), SplitSettlement);
		codesByName.put(Transformation.getCodeName().get(), Transformation);
		codesByName.put(TripartySegregation.getCodeName().get(), TripartySegregation);
		codesByName.put(Unexposed.getCodeName().get(), Unexposed);
	}

	public static SettlementTransactionCondition10Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementTransactionCondition10Code[] values() {
		SettlementTransactionCondition10Code[] values = new SettlementTransactionCondition10Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementTransactionCondition10Code> {
		@Override
		public SettlementTransactionCondition10Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementTransactionCondition10Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}