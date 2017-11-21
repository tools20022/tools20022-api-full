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
 * Configuration of the exchanges to perform the cancellation of a payment
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode#mmNotAllowed
 * CancellationProcessCode.mmNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode#mmAdvice
 * CancellationProcessCode.mmAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode#mmRequest
 * CancellationProcessCode.mmRequest}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CancellationProcess1Code
 * CancellationProcess1Code}</li>
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
 * <li>"NALW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationProcessCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Configuration of the exchanges to perform the cancellation of a payment transaction."
 * </li>
 * </ul>
 */
public class CancellationProcessCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card payment transaction cannot be cancelled by the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode
	 * CancellationProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NALW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction cannot be cancelled by the acquirer."</li>
	 * </ul>
	 */
	public static final MMCode mmNotAllowed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAllowed";
			definition = "Card payment transaction cannot be cancelled by the acquirer.";
			owner_lazy = () -> CancellationProcessCode.mmObject();
			codeName = "NALW";
		}
	};
	/**
	 * Card payment transaction may be cancelled by an advice only before
	 * closure of the reconciliation period or before the capture by batch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode
	 * CancellationProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADVC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Advice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction may be cancelled by an advice only before closure of the reconciliation period or before the capture by batch."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Advice";
			definition = "Card payment transaction may be cancelled by an advice only before closure of the reconciliation period or before the capture by batch.";
			owner_lazy = () -> CancellationProcessCode.mmObject();
			codeName = "ADVC";
		}
	};
	/**
	 * Card payment transaction may also be cancelled after the closure of the
	 * reconciliation period or after the capture by batch. In this case a
	 * cancellation request exchange is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode
	 * CancellationProcessCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Request"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transaction may also be cancelled after the closure of the reconciliation period or after the capture by batch. In this case a cancellation request exchange is required."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Request";
			definition = "Card payment transaction may also be cancelled after the closure of the reconciliation period or after the capture by batch. In this case a cancellation request exchange is required.";
			owner_lazy = () -> CancellationProcessCode.mmObject();
			codeName = "REQU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NALW");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationProcessCode";
				definition = "Configuration of the exchanges to perform the cancellation of a payment transaction.";
				code_lazy = () -> Arrays.asList(CancellationProcessCode.mmNotAllowed, CancellationProcessCode.mmAdvice, CancellationProcessCode.mmRequest);
				derivation_lazy = () -> Arrays.asList(CancellationProcess1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}