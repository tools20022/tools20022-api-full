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
 * Indicates the redemption type of the interest bearing instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RedemptionTypeCode#mmPreFunded
 * RedemptionTypeCode.mmPreFunded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RedemptionTypeCode#mmEscrowed
 * RedemptionTypeCode.mmEscrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RedemptionTypeCode#mmConvertible
 * RedemptionTypeCode.mmConvertible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RedemptionTypeCode#mmCallable
 * RedemptionTypeCode.mmCallable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RedemptionTypeCode#mmPutable
 * RedemptionTypeCode.mmPutable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RedemptionType1Code
 * RedemptionType1Code}</li>
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
 * <li>"PFIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the redemption type of the interest bearing instrument."</li>
 * </ul>
 */
public class RedemptionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether an interest bearing instrument is being escrowed or
	 * collateralized either by direct obligations guaranteed by the US
	 * government, or by other types of securities. The maturity schedules of
	 * the securities in the escrow fund are determined in such a way to pay the
	 * maturity value, coupon, and premium payments (if any) of the refunded
	 * bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RedemptionTypeCode
	 * RedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PFIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreFunded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPreFunded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreFunded";
			definition = "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds.";
			owner_lazy = () -> RedemptionTypeCode.mmObject();
			codeName = "PFIN";
		}
	};
	/**
	 * Indicates whether an interest bearing instrument is deposited in a fund
	 * that will be used to pay debt service on refunded securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RedemptionTypeCode
	 * RedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Escrowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEscrowed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Escrowed";
			definition = "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities.";
			owner_lazy = () -> RedemptionTypeCode.mmObject();
			codeName = "ESIN";
		}
	};
	/**
	 * Indicates whether the interest bearing instrument is convertible into
	 * another type of financial instrument or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RedemptionTypeCode
	 * RedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Convertible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest bearing instrument is convertible into another type of financial instrument or not."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConvertible = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Convertible";
			definition = "Indicates whether the interest bearing instrument is convertible into another type of financial instrument or not.";
			owner_lazy = () -> RedemptionTypeCode.mmObject();
			codeName = "COIN";
		}
	};
	/**
	 * Indicates whether the issuer has the right to pay the bond prior to
	 * maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RedemptionTypeCode
	 * RedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Callable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the issuer has the right to pay the bond prior to maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCallable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Callable";
			definition = "Indicates whether the issuer has the right to pay the bond prior to maturity.";
			owner_lazy = () -> RedemptionTypeCode.mmObject();
			codeName = "CAIN";
		}
	};
	/**
	 * Indicates whether the bondholder has the right to redeem the principal
	 * amount of a bond prior to final maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RedemptionTypeCode
	 * RedemptionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Putable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the bondholder has the right to redeem the principal amount of a bond prior to final maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPutable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Putable";
			definition = "Indicates whether the bondholder has the right to redeem the principal amount of a bond prior to final maturity.";
			owner_lazy = () -> RedemptionTypeCode.mmObject();
			codeName = "PUIN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PFIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionTypeCode";
				definition = "Indicates the redemption type of the interest bearing instrument.";
				code_lazy = () -> Arrays.asList(RedemptionTypeCode.mmPreFunded, RedemptionTypeCode.mmEscrowed, RedemptionTypeCode.mmConvertible, RedemptionTypeCode.mmCallable, RedemptionTypeCode.mmPutable);
				derivation_lazy = () -> Arrays.asList(RedemptionType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}