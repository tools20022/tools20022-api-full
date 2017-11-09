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
 * Specifies which party(ies) will pay charges due for processing of the payment
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearer1Code
 * ChargeBearer1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode#mmBorneByDebtor
 * ChargeBearerCode.mmBorneByDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode#mmBorneByCreditor
 * ChargeBearerCode.mmBorneByCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearerCode#mmShared
 * ChargeBearerCode.mmShared}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode#mmInvestor
 * ChargeBearerCode.mmInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode#mmIntermediary
 * ChargeBearerCode.mmIntermediary}</li>
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
 * <li>"OUR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeBearerCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies which party(ies) will pay charges due for processing of the payment transaction."
 * </li>
 * </ul>
 */
public class ChargeBearerCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * All transaction charges are to be borne by the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode
	 * ChargeBearerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OUR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All transaction charges are to be borne by the debtor."</li>
	 * </ul>
	 */
	public static final MMCode mmBorneByDebtor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BorneByDebtor";
			definition = "All transaction charges are to be borne by the debtor.";
			owner_lazy = () -> ChargeBearerCode.mmObject();
			codeName = "OUR";
		}
	};
	/**
	 * All transaction charges are to be borne by the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode
	 * ChargeBearerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All transaction charges are to be borne by the creditor."</li>
	 * </ul>
	 */
	public static final MMCode mmBorneByCreditor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BorneByCreditor";
			definition = "All transaction charges are to be borne by the creditor.";
			owner_lazy = () -> ChargeBearerCode.mmObject();
			codeName = "BEN";
		}
	};
	/**
	 * Under the credit transfer scenario, transaction charges on the sender's
	 * side are to be borne by the debtor; transaction charges on the receiver's
	 * side are to be borne by the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode
	 * ChargeBearerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shared"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Under the credit transfer scenario, transaction charges on the sender's side are to be borne by the debtor; transaction charges on the receiver's side are to be borne by the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmShared = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Shared";
			definition = "Under the credit transfer scenario, transaction charges on the sender's side are to be borne by the debtor; transaction charges on the receiver's side are to be borne by the creditor.";
			owner_lazy = () -> ChargeBearerCode.mmObject();
			codeName = "SHA";
		}
	};
	/**
	 * All charges are to be borne by the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode
	 * ChargeBearerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All charges are to be borne by the investor."</li>
	 * </ul>
	 */
	public static final MMCode mmInvestor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Investor";
			definition = "All charges are to be borne by the investor.";
			owner_lazy = () -> ChargeBearerCode.mmObject();
			codeName = "INVR";
		}
	};
	/**
	 * All charges are to be borne by the intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode
	 * ChargeBearerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All charges are to be borne by the intermediary."</li>
	 * </ul>
	 */
	public static final MMCode mmIntermediary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Intermediary";
			definition = "All charges are to be borne by the intermediary.";
			owner_lazy = () -> ChargeBearerCode.mmObject();
			codeName = "INTR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("OUR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeBearerCode";
				definition = "Specifies which party(ies) will pay charges due for processing of the payment transaction.";
				code_lazy = () -> Arrays.asList(ChargeBearerCode.mmBorneByDebtor, ChargeBearerCode.mmBorneByCreditor, ChargeBearerCode.mmShared, ChargeBearerCode.mmInvestor, ChargeBearerCode.mmIntermediary);
				derivation_lazy = () -> Arrays.asList(ChargeBearer1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}