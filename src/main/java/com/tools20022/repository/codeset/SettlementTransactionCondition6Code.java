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
import com.tools20022.repository.codeset.SettlementTransactionCondition6Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#Assignement
 * SettlementTransactionCondition6Code.Assignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#BuytoCover
 * SettlementTransactionCondition6Code.BuytoCover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#Clean
 * SettlementTransactionCondition6Code.Clean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#Dirty
 * SettlementTransactionCondition6Code.Dirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#DeliveryWithoutMatching
 * SettlementTransactionCondition6Code.DeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#Drawn
 * SettlementTransactionCondition6Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#Exercised
 * SettlementTransactionCondition6Code.Exercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#FreeCleanSettlement
 * SettlementTransactionCondition6Code.FreeCleanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#KnockedOut
 * SettlementTransactionCondition6Code.KnockedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#Physical
 * SettlementTransactionCondition6Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#Residual
 * SettlementTransactionCondition6Code.Residual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#ShortSell
 * SettlementTransactionCondition6Code.ShortSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#SpecialDelivery
 * SettlementTransactionCondition6Code.SpecialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#SplitSettlement
 * SettlementTransactionCondition6Code.SplitSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#Expired
 * SettlementTransactionCondition6Code.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#PendingSale
 * SettlementTransactionCondition6Code.PendingSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#Unexposed
 * SettlementTransactionCondition6Code.Unexposed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#TripartySegregation
 * SettlementTransactionCondition6Code.TripartySegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#NoAutomaticMarketClaim
 * SettlementTransactionCondition6Code.NoAutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#Transformation
 * SettlementTransactionCondition6Code.Transformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#Rehypothecation
 * SettlementTransactionCondition6Code.Rehypothecation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code#AcceptAfterRegularSettlementDeadline
 * SettlementTransactionCondition6Code.AcceptAfterRegularSettlementDeadline}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ASGN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTransactionCondition6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be settled."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
 * SettlementTransactionCondition8Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementTransactionCondition6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code Assignement = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.Assignement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuytoCover"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code BuytoCover = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuytoCover";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.BuytoCover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code Clean = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clean";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.Clean.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code Dirty = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dirty";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.Dirty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryWithoutMatching"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code DeliveryWithoutMatching = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryWithoutMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.DeliveryWithoutMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code Drawn = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.Drawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercised"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code Exercised = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercised";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.Exercised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeCleanSettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code FreeCleanSettlement = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeCleanSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.FreeCleanSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnockedOut"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code KnockedOut = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnockedOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.KnockedOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code Physical = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.Physical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residual"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code Residual = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Residual";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.Residual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSell"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code ShortSell = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortSell";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.ShortSell.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDelivery"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code SpecialDelivery = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.SpecialDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitSettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code SplitSettlement = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.SplitSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code Expired = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.Expired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSale"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code PendingSale = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSale";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.PendingSale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unexposed"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code Unexposed = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unexposed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.Unexposed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartySegregation"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code TripartySegregation = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartySegregation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.TripartySegregation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaim"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code NoAutomaticMarketClaim = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomaticMarketClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.NoAutomaticMarketClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transformation"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code Transformation = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transformation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.Transformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rehypothecation"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code Rehypothecation = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rehypothecation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.Rehypothecation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
	 * SettlementTransactionCondition6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptAfterRegularSettlementDeadline"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition6Code AcceptAfterRegularSettlementDeadline = new SettlementTransactionCondition6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptAfterRegularSettlementDeadline";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition6Code.mmObject();
			codeName = SettlementTransactionConditionCode.AcceptAfterRegularSettlementDeadline.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementTransactionCondition6Code> codesByName = new LinkedHashMap<>();

	protected SettlementTransactionCondition6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ASGN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionCondition6Code";
				definition = "Specifies the conditions under which the order/trade is to be settled.";
				nextVersions_lazy = () -> Arrays.asList(SettlementTransactionCondition8Code.mmObject());
				trace_lazy = () -> SettlementTransactionConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionCondition6Code.Assignement, com.tools20022.repository.codeset.SettlementTransactionCondition6Code.BuytoCover,
						com.tools20022.repository.codeset.SettlementTransactionCondition6Code.Clean, com.tools20022.repository.codeset.SettlementTransactionCondition6Code.Dirty,
						com.tools20022.repository.codeset.SettlementTransactionCondition6Code.DeliveryWithoutMatching, com.tools20022.repository.codeset.SettlementTransactionCondition6Code.Drawn,
						com.tools20022.repository.codeset.SettlementTransactionCondition6Code.Exercised, com.tools20022.repository.codeset.SettlementTransactionCondition6Code.FreeCleanSettlement,
						com.tools20022.repository.codeset.SettlementTransactionCondition6Code.KnockedOut, com.tools20022.repository.codeset.SettlementTransactionCondition6Code.Physical,
						com.tools20022.repository.codeset.SettlementTransactionCondition6Code.Residual, com.tools20022.repository.codeset.SettlementTransactionCondition6Code.ShortSell,
						com.tools20022.repository.codeset.SettlementTransactionCondition6Code.SpecialDelivery, com.tools20022.repository.codeset.SettlementTransactionCondition6Code.SplitSettlement,
						com.tools20022.repository.codeset.SettlementTransactionCondition6Code.Expired, com.tools20022.repository.codeset.SettlementTransactionCondition6Code.PendingSale,
						com.tools20022.repository.codeset.SettlementTransactionCondition6Code.Unexposed, com.tools20022.repository.codeset.SettlementTransactionCondition6Code.TripartySegregation,
						com.tools20022.repository.codeset.SettlementTransactionCondition6Code.NoAutomaticMarketClaim, com.tools20022.repository.codeset.SettlementTransactionCondition6Code.Transformation,
						com.tools20022.repository.codeset.SettlementTransactionCondition6Code.Rehypothecation, com.tools20022.repository.codeset.SettlementTransactionCondition6Code.AcceptAfterRegularSettlementDeadline);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Assignement.getCodeName().get(), Assignement);
		codesByName.put(BuytoCover.getCodeName().get(), BuytoCover);
		codesByName.put(Clean.getCodeName().get(), Clean);
		codesByName.put(Dirty.getCodeName().get(), Dirty);
		codesByName.put(DeliveryWithoutMatching.getCodeName().get(), DeliveryWithoutMatching);
		codesByName.put(Drawn.getCodeName().get(), Drawn);
		codesByName.put(Exercised.getCodeName().get(), Exercised);
		codesByName.put(FreeCleanSettlement.getCodeName().get(), FreeCleanSettlement);
		codesByName.put(KnockedOut.getCodeName().get(), KnockedOut);
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(Residual.getCodeName().get(), Residual);
		codesByName.put(ShortSell.getCodeName().get(), ShortSell);
		codesByName.put(SpecialDelivery.getCodeName().get(), SpecialDelivery);
		codesByName.put(SplitSettlement.getCodeName().get(), SplitSettlement);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(PendingSale.getCodeName().get(), PendingSale);
		codesByName.put(Unexposed.getCodeName().get(), Unexposed);
		codesByName.put(TripartySegregation.getCodeName().get(), TripartySegregation);
		codesByName.put(NoAutomaticMarketClaim.getCodeName().get(), NoAutomaticMarketClaim);
		codesByName.put(Transformation.getCodeName().get(), Transformation);
		codesByName.put(Rehypothecation.getCodeName().get(), Rehypothecation);
		codesByName.put(AcceptAfterRegularSettlementDeadline.getCodeName().get(), AcceptAfterRegularSettlementDeadline);
	}

	public static SettlementTransactionCondition6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementTransactionCondition6Code[] values() {
		SettlementTransactionCondition6Code[] values = new SettlementTransactionCondition6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementTransactionCondition6Code> {
		@Override
		public SettlementTransactionCondition6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementTransactionCondition6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}