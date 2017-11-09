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
import com.tools20022.repository.codeset.DisputeResolutionTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature of the disputed collateral amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
 * DisputeResolutionTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#mmReconcileCollateral
 * DisputeResolutionType2Code.mmReconcileCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#mmReconcileExposure
 * DisputeResolutionType2Code.mmReconcileExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#mmReconcileThreshold
 * DisputeResolutionType2Code.mmReconcileThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#mmReconcileMinimumTransferAmount
 * DisputeResolutionType2Code.mmReconcileMinimumTransferAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#mmReconcileRounding
 * DisputeResolutionType2Code.mmReconcileRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#mmReconcileValuationFrequency
 * DisputeResolutionType2Code.mmReconcileValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code#mmReconcileNettedIndependentAmount
 * DisputeResolutionType2Code.mmReconcileNettedIndependentAmount}</li>
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
 * <li>"RECO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DisputeResolutionType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of the disputed collateral amount."</li>
 * </ul>
 */
public class DisputeResolutionType2Code extends DisputeResolutionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileCollateral"</li>
	 * </ul>
	 */
	public static final MMCode mmReconcileCollateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileCollateral";
			owner_lazy = () -> DisputeResolutionType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileExposure"</li>
	 * </ul>
	 */
	public static final MMCode mmReconcileExposure = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileExposure";
			owner_lazy = () -> DisputeResolutionType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileThreshold"</li>
	 * </ul>
	 */
	public static final MMCode mmReconcileThreshold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileThreshold";
			owner_lazy = () -> DisputeResolutionType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileMinimumTransferAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmReconcileMinimumTransferAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileMinimumTransferAmount";
			owner_lazy = () -> DisputeResolutionType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileRounding"</li>
	 * </ul>
	 */
	public static final MMCode mmReconcileRounding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileRounding";
			owner_lazy = () -> DisputeResolutionType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileValuationFrequency"</li>
	 * </ul>
	 */
	public static final MMCode mmReconcileValuationFrequency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileValuationFrequency";
			owner_lazy = () -> DisputeResolutionType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionType2Code
	 * DisputeResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconcileNettedIndependentAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmReconcileNettedIndependentAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconcileNettedIndependentAmount";
			owner_lazy = () -> DisputeResolutionType2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RECO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisputeResolutionType2Code";
				definition = "Specifies the nature of the disputed collateral amount.";
				code_lazy = () -> Arrays.asList(DisputeResolutionType2Code.mmReconcileCollateral, DisputeResolutionType2Code.mmReconcileExposure, DisputeResolutionType2Code.mmReconcileThreshold,
						DisputeResolutionType2Code.mmReconcileMinimumTransferAmount, DisputeResolutionType2Code.mmReconcileRounding, DisputeResolutionType2Code.mmReconcileValuationFrequency,
						DisputeResolutionType2Code.mmReconcileNettedIndependentAmount);
				trace_lazy = () -> DisputeResolutionTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}