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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how the transaction is to be settled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code#mmFree
 * DeliveryReceiptType1Code.mmFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code#mmAgainstPayment
 * DeliveryReceiptType1Code.mmAgainstPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code#mmSplitFromPayment
 * DeliveryReceiptType1Code.mmSplitFromPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FREE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveryReceiptType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies how the transaction is to be settled."</li>
 * </ul>
 */
public class DeliveryReceiptType1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settled free of payment. The securities movement is a result of an
	 * in-kind transaction or a custodial bank move.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code
	 * DeliveryReceiptType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Free"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settled free of payment. The securities movement is a result of an in-kind transaction or a custodial bank move."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFree = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Free";
			definition = "Settled free of payment. The securities movement is a result of an in-kind transaction or a custodial bank move.";
			owner_lazy = () -> DeliveryReceiptType1Code.mmObject();
			codeName = "FREE";
		}
	};
	/**
	 * Settled against payment. Delivery or receipt is against payment, ie, DVP
	 * or RVP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code
	 * DeliveryReceiptType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settled against payment. Delivery or receipt is against payment, ie, DVP or RVP."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAgainstPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgainstPayment";
			definition = "Settled against payment. Delivery or receipt is against payment, ie, DVP or RVP.";
			owner_lazy = () -> DeliveryReceiptType1Code.mmObject();
			codeName = "APMT";
		}
	};
	/**
	 * Settled separate from payment. Delivery or receipt is free, with a
	 * separate payment arrangement, eg, a separate cash instruction from the
	 * buy side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType1Code
	 * DeliveryReceiptType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitFromPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settled separate from payment. Delivery or receipt is free, with a separate payment arrangement, eg, a separate cash instruction from the buy side."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSplitFromPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SplitFromPayment";
			definition = "Settled separate from payment. Delivery or receipt is free, with a separate payment arrangement, eg, a separate cash instruction from the buy side.";
			owner_lazy = () -> DeliveryReceiptType1Code.mmObject();
			codeName = "DSPA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FREE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveryReceiptType1Code";
				definition = "Specifies how the transaction is to be settled.";
				code_lazy = () -> Arrays.asList(DeliveryReceiptType1Code.mmFree, DeliveryReceiptType1Code.mmAgainstPayment, DeliveryReceiptType1Code.mmSplitFromPayment);
			}
		});
		return mmObject_lazy.get();
	}
}