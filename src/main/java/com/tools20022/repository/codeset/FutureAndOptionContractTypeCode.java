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
 * Future And Option Contract Type
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractTypeCode#mmOrdinary
 * FutureAndOptionContractTypeCode.mmOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractTypeCode#mmIndex
 * FutureAndOptionContractTypeCode.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractTypeCode#mmExercisedFuture
 * FutureAndOptionContractTypeCode.mmExercisedFuture}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractType1Code
 * FutureAndOptionContractType1Code}</li>
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
 * <li>"ORDY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FutureAndOptionContractTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Future And Option Contract Type"</li>
 * </ul>
 */
public class FutureAndOptionContractTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ordinary future and option contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractTypeCode
	 * FutureAndOptionContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ordinary future and option contract."</li>
	 * </ul>
	 */
	public static final MMCode mmOrdinary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			definition = "Ordinary future and option contract.";
			owner_lazy = () -> FutureAndOptionContractTypeCode.mmObject();
			codeName = "ORDY";
		}
	};
	/**
	 * Future and option contract on an index as opposed to an underlying
	 * equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractTypeCode
	 * FutureAndOptionContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Future and option contract on an index as opposed to an underlying equity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIndex = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Future and option contract on an index as opposed to an underlying equity.";
			owner_lazy = () -> FutureAndOptionContractTypeCode.mmObject();
			codeName = "INDX";
		}
	};
	/**
	 * Receipt of future contract when an option on a future is exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FutureAndOptionContractTypeCode
	 * FutureAndOptionContractTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXFU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisedFuture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Receipt of future contract when an option on a future is exercised."</li>
	 * </ul>
	 */
	public static final MMCode mmExercisedFuture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisedFuture";
			definition = "Receipt of future contract when an option on a future is exercised.";
			owner_lazy = () -> FutureAndOptionContractTypeCode.mmObject();
			codeName = "EXFU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ORDY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FutureAndOptionContractTypeCode";
				definition = "Future And Option Contract Type";
				code_lazy = () -> Arrays.asList(FutureAndOptionContractTypeCode.mmOrdinary, FutureAndOptionContractTypeCode.mmIndex, FutureAndOptionContractTypeCode.mmExercisedFuture);
				derivation_lazy = () -> Arrays.asList(FutureAndOptionContractType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}