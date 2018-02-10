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
import com.tools20022.repository.codeset.SettlementTransactionCondition8Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Assignement
 * SettlementTransactionCondition8Code.Assignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#BuytoCover
 * SettlementTransactionCondition8Code.BuytoCover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Clean
 * SettlementTransactionCondition8Code.Clean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Dirty
 * SettlementTransactionCondition8Code.Dirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#DeliveryWithoutMatching
 * SettlementTransactionCondition8Code.DeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Drawn
 * SettlementTransactionCondition8Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Exercised
 * SettlementTransactionCondition8Code.Exercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#FreeCleanSettlement
 * SettlementTransactionCondition8Code.FreeCleanSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#KnockedOut
 * SettlementTransactionCondition8Code.KnockedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Physical
 * SettlementTransactionCondition8Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Residual
 * SettlementTransactionCondition8Code.Residual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#ShortSell
 * SettlementTransactionCondition8Code.ShortSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#SpecialDelivery
 * SettlementTransactionCondition8Code.SpecialDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#SplitSettlement
 * SettlementTransactionCondition8Code.SplitSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Expired
 * SettlementTransactionCondition8Code.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#PendingSale
 * SettlementTransactionCondition8Code.PendingSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Unexposed
 * SettlementTransactionCondition8Code.Unexposed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#TripartySegregation
 * SettlementTransactionCondition8Code.TripartySegregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#NoAutomaticMarketClaim
 * SettlementTransactionCondition8Code.NoAutomaticMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Transformation
 * SettlementTransactionCondition8Code.Transformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Rehypothecation
 * SettlementTransactionCondition8Code.Rehypothecation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#AcceptAfterRegularSettlementDeadline
 * SettlementTransactionCondition8Code.AcceptAfterRegularSettlementDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code#Reporting
 * SettlementTransactionCondition8Code.Reporting}</li>
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
 * "SettlementTransactionCondition8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be settled."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition6Code
 * SettlementTransactionCondition6Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementTransactionCondition8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Assignement = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Assignement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuytoCover"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code BuytoCover = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuytoCover";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.BuytoCover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Clean = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clean";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Clean.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Dirty = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dirty";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Dirty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryWithoutMatching"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code DeliveryWithoutMatching = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryWithoutMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.DeliveryWithoutMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Drawn = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Drawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercised"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Exercised = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercised";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Exercised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeCleanSettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code FreeCleanSettlement = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeCleanSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.FreeCleanSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnockedOut"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code KnockedOut = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnockedOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.KnockedOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Physical = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Physical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Residual"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Residual = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Residual";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Residual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortSell"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code ShortSell = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortSell";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.ShortSell.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDelivery"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code SpecialDelivery = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.SpecialDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitSettlement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code SplitSettlement = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.SplitSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Expired = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Expired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSale"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code PendingSale = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSale";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.PendingSale.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unexposed"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Unexposed = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unexposed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Unexposed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartySegregation"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code TripartySegregation = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartySegregation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.TripartySegregation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomaticMarketClaim"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code NoAutomaticMarketClaim = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomaticMarketClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.NoAutomaticMarketClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transformation"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Transformation = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transformation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Transformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rehypothecation"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Rehypothecation = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rehypothecation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Rehypothecation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptAfterRegularSettlementDeadline"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code AcceptAfterRegularSettlementDeadline = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptAfterRegularSettlementDeadline";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.AcceptAfterRegularSettlementDeadline.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionCondition8Code
	 * SettlementTransactionCondition8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * </ul>
	 */
	public static final SettlementTransactionCondition8Code Reporting = new SettlementTransactionCondition8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionCondition8Code.mmObject();
			codeName = SettlementTransactionConditionCode.Reporting.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementTransactionCondition8Code> codesByName = new LinkedHashMap<>();

	protected SettlementTransactionCondition8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ASGN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionCondition8Code";
				definition = "Specifies the conditions under which the order/trade is to be settled.";
				previousVersion_lazy = () -> SettlementTransactionCondition6Code.mmObject();
				trace_lazy = () -> SettlementTransactionConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Assignement, com.tools20022.repository.codeset.SettlementTransactionCondition8Code.BuytoCover,
						com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Clean, com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Dirty,
						com.tools20022.repository.codeset.SettlementTransactionCondition8Code.DeliveryWithoutMatching, com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Drawn,
						com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Exercised, com.tools20022.repository.codeset.SettlementTransactionCondition8Code.FreeCleanSettlement,
						com.tools20022.repository.codeset.SettlementTransactionCondition8Code.KnockedOut, com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Physical,
						com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Residual, com.tools20022.repository.codeset.SettlementTransactionCondition8Code.ShortSell,
						com.tools20022.repository.codeset.SettlementTransactionCondition8Code.SpecialDelivery, com.tools20022.repository.codeset.SettlementTransactionCondition8Code.SplitSettlement,
						com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Expired, com.tools20022.repository.codeset.SettlementTransactionCondition8Code.PendingSale,
						com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Unexposed, com.tools20022.repository.codeset.SettlementTransactionCondition8Code.TripartySegregation,
						com.tools20022.repository.codeset.SettlementTransactionCondition8Code.NoAutomaticMarketClaim, com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Transformation,
						com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Rehypothecation, com.tools20022.repository.codeset.SettlementTransactionCondition8Code.AcceptAfterRegularSettlementDeadline,
						com.tools20022.repository.codeset.SettlementTransactionCondition8Code.Reporting);
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
		codesByName.put(Reporting.getCodeName().get(), Reporting);
	}

	public static SettlementTransactionCondition8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementTransactionCondition8Code[] values() {
		SettlementTransactionCondition8Code[] values = new SettlementTransactionCondition8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementTransactionCondition8Code> {
		@Override
		public SettlementTransactionCondition8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementTransactionCondition8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}