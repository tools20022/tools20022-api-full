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
 * Error codes generated when the response to a query exceeds the maximum size
 * or the data is not available.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ErrorHandling1Code
 * ErrorHandling1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode#mmDataNotYetAvailable
 * ErrorHandlingCode.mmDataNotYetAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode#mmMessageSizeLimitExceeded
 * ErrorHandlingCode.mmMessageSizeLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode#mmDataNotAvailable
 * ErrorHandlingCode.mmDataNotAvailable}</li>
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
 * <li>"X020"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ErrorHandlingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Error codes generated when the response to a query exceeds the maximum size or the data is not available."
 * </li>
 * </ul>
 */
public class ErrorHandlingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the error code when the data requested are not yet available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode
	 * ErrorHandlingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "X020"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataNotYetAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the error code when the data requested are not yet available."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDataNotYetAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataNotYetAvailable";
			definition = "Specifies the error code when the data requested are not yet available.";
			owner_lazy = () -> ErrorHandlingCode.mmObject();
			codeName = "X020";
		}
	};
	/**
	 * Specifies the error code when the data requested generates a message size
	 * that exceed the processing capacity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode
	 * ErrorHandlingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "X030"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageSizeLimitExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the error code when the data requested generates a message size that exceed the processing capacity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMessageSizeLimitExceeded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageSizeLimitExceeded";
			definition = "Specifies the error code when the data requested generates a message size that exceed the processing capacity.";
			owner_lazy = () -> ErrorHandlingCode.mmObject();
			codeName = "X030";
		}
	};
	/**
	 * Specifies the error code when the data requested have not been found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ErrorHandlingCode
	 * ErrorHandlingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "X050"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataNotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the error code when the data requested have not been found."</li>
	 * </ul>
	 */
	public static final MMCode mmDataNotAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataNotAvailable";
			definition = "Specifies the error code when the data requested have not been found.";
			owner_lazy = () -> ErrorHandlingCode.mmObject();
			codeName = "X050";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("X020");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ErrorHandlingCode";
				definition = "Error codes generated when the response to a query exceeds the maximum size or the data is not available.";
				code_lazy = () -> Arrays.asList(ErrorHandlingCode.mmDataNotYetAvailable, ErrorHandlingCode.mmMessageSizeLimitExceeded, ErrorHandlingCode.mmDataNotAvailable);
				derivation_lazy = () -> Arrays.asList(ErrorHandling1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}